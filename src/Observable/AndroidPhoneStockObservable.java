package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidPhoneStockObservable implements StocksObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : observerList){
            notificationAlertObserver.update("Android");
        }
    }

    @Override
    public void setStocks(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = newStockCount;
    }
}
