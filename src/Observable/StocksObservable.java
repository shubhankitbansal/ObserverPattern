package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setStocks(int newStockCount);
}
