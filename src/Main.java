import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ProductStockObservableImpl productStockObservable = new ProductStockObservableImpl();
        //HashMap<Integer,String> getProduct = new HashMap<>();
        Product iphone = new Product(1,"iphone");
        Product bottle = new Product(2,"bottle");

        NotificationAlertObserver observer1 = new EmailNotificationObserverImpl("observer1@gmail.com",iphone);
        NotificationAlertObserver observer2 = new MobileNotificationObserverImpl("observer2",bottle);
        NotificationAlertObserver observer3 = new EmailNotificationObserverImpl("bhanu@gmail.com",iphone);



        productStockObservable.add(observer1);
        productStockObservable.add(observer2);
        productStockObservable.add(observer3);

        //System.out.println(productStockObservable.productObserver.containsKey(3));

        productStockObservable.addProductStockCount(iphone.getId(),5);
        productStockObservable.addProductStockCount(bottle.getId(),10);



//        IphoneStockObservableImpl iphoneStockObservable = new IphoneStockObservableImpl();
//
//        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("user1@gmail.com",iphoneStockObservable);
//        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("user2",iphoneStockObservable);
//
//        iphoneStockObservable.add(observer1);
//        iphoneStockObservable.add(observer2);
//
//        //System.out.println(iphoneStockObservable.getProductStockCount());
//        iphoneStockObservable.addProductStockCount(10);

    }
}