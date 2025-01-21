public class EmailNotificationObserverImpl implements NotificationAlertObserver{
    private String email;
    private Product product; // The product ID the observer is interested in

    EmailNotificationObserverImpl(String email, Product product) {
        this.email = email;
        this.product = product;
    }

    @Override
    public void update() {
        System.out.println("Sending email to " + email + " about availability of product " + product.getName());
    }

    public int getProductId() {
        return product.getId();
    }
}
