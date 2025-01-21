import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProductStockObservableImpl implements ProductStockObservable{
    HashMap<Integer,Integer> productStock = new HashMap<>();//productId to product count
    HashMap<Integer, Set<NotificationAlertObserver>> productObserver = new HashMap<>();


    @Override
    public void add(NotificationAlertObserver observer) {
        if(observer instanceof EmailNotificationObserverImpl){
            EmailNotificationObserverImpl emailObserver = (EmailNotificationObserverImpl) observer;
            int productId = emailObserver.getProductId();

            if(!productObserver.containsKey(productId)){
                Set<NotificationAlertObserver> observerListSet = new HashSet<>();
                observerListSet.add(observer);
                productObserver.put(productId,observerListSet);
            }else{
                Set<NotificationAlertObserver> observerListSet = productObserver.get(productId);
                observerListSet.add(emailObserver);
            }


        }else if(observer instanceof MobileNotificationObserverImpl){
            MobileNotificationObserverImpl mobileObserver = (MobileNotificationObserverImpl) observer;
            int productId = mobileObserver.getProductId();

            if(!productObserver.containsKey(productId)){
                Set<NotificationAlertObserver> observerListSet = new HashSet<>();
                observerListSet.add(observer);
                productObserver.put(productId,observerListSet);
            }else{
                Set<NotificationAlertObserver> observerListSet = productObserver.get(productId);
                observerListSet.add(mobileObserver);
            }
        }
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        if(observer instanceof EmailNotificationObserverImpl){
            EmailNotificationObserverImpl emailObserver = (EmailNotificationObserverImpl) observer;
            int productId = emailObserver.getProductId();

            if(!productObserver.containsKey(productId)){
                return;
            }else{
                Set<NotificationAlertObserver> observerListSet = productObserver.get(productId);
                //if(observerListSet.contains(emailObserver)){
                observerListSet.remove(emailObserver);
                //}

            }


        }else if(observer instanceof MobileNotificationObserverImpl){
            MobileNotificationObserverImpl mobileObserver = (MobileNotificationObserverImpl) observer;
            int productId = mobileObserver.getProductId();

            if(!productObserver.containsKey(productId)){
                return;
            }else{
                Set<NotificationAlertObserver> observerListSet = productObserver.get(productId);
                //if(observerListSet.contains(emailObserver)){
                observerListSet.remove(mobileObserver);
                //}

            }

        }
    }

    @Override
    public int getProductStockCount(int productId) {
        return productStock.getOrDefault(productId,0);
    }

    @Override
    public void addProductStockCount(int productId,int countOfNewAddedStockItem) {
        int stockCount = productStock.getOrDefault(productId,0);
        if(stockCount==0 && countOfNewAddedStockItem>0){
            notifySubscriber(productId);
        }
        productStock.put(productId,productStock.getOrDefault(productId,0)+countOfNewAddedStockItem);
    }

    @Override
    public void notifySubscriber(int productId) {
        Set<NotificationAlertObserver> observerListSet = productObserver.get(productId);
        if(observerListSet!=null){
            //System.out.println(observerListSet.size());
            for(NotificationAlertObserver observer:observerListSet){
                observer.update();
            }
            //System.out.println("2");
        }
    }

}
