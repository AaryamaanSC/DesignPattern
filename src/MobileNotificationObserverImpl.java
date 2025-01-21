public class MobileNotificationObserverImpl implements NotificationAlertObserver {
    private String username;
    private Product product; // The product ID the observer is interested in

    MobileNotificationObserverImpl(String username, Product product) {
        this.username = username;
        this.product = product;
    }

    @Override
    public void update() {
        System.out.println("Sending notification to " + username + " about about availability of product " + product.getName() );
    }

    public int getProductId() {
        return product.getId();
    }
}
