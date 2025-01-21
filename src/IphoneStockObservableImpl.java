//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class IphoneStockObservableImpl implements ProductStockObservable{
//
//    Set<NotificationAlertObserver> observerListSet = new HashSet<>();
//    int stockCount = 0;
//
//    @Override
//    public void add(NotificationAlertObserver observer) {
//            observerListSet.add(observer);
//    }
//
//    @Override
//    public void remove(NotificationAlertObserver observer) {
//        if(observerListSet.contains(observer)){
//            observerListSet.remove(observer);
//        }
//    }observerListSet
//
//    @Override
//    public int getProductStockCount() {
//        return stockCount;
//    }
//
//    @Override
//    public void addProductStockCount(int countOfNewAddedStockItem) {
//        if(stockCount==0){
//            notifySubscribers();
//        }
//        stockCount+=countOfNewAddedStockItem;
//    }
//
//    @Override
//    public void notifySubscribers() {
//        for(NotificationAlertObserver observer:observerListSet){
//            observer.update();
//        }
//    }
//}
