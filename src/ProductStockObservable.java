public interface ProductStockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    //int getProductStockCount();
    int getProductStockCount(int productId);
    //void addProductStockCount(int countOfNewAddedStockItem);
    void addProductStockCount(int productId,int countNewAddedItem);
    //void notifySubscribers();
    void notifySubscriber(int productId);
}
