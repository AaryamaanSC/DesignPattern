//public class MobileAlertObserverImpl implements NotificationAlertObserver{
//    String username;
//    ProductStockObservable productStockObservable;
//
//    MobileAlertObserverImpl(String username,ProductStockObservable productStockObservable){
//        this.username = username;
//        this.productStockObservable = productStockObservable;
//    }
//
//
//    @Override
//    public void update() {
//        sendMobileNotification(username,"product is available now with count "+productStockObservable.getProductStockCount());
//    }
//
//    void sendMobileNotification(String email,String msg) {
//        System.out.println("notification sent to "+email+" with message: "+msg );
//    }
//}
