//public class EmailAlertObserverImpl implements NotificationAlertObserver{
//    String email;
//    ProductStockObservable productStockObservable;//data lene ke liye h
//
//    EmailAlertObserverImpl(String email,ProductStockObservable productStockObservable){
//        this.email = email;
//        this.productStockObservable = productStockObservable;
//    }
//
//
//    @Override
//    public void update() {
//        sendEmail(email,"product is available now with product count "+productStockObservable.getProductStockCount());
//    }
//
//    void sendEmail(String email,String msg){
//        System.out.println("mail sent to "+email+" with message: "+msg );
//    }
//}
