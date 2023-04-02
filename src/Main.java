import Observable.AndroidPhoneStockObservable;
import Observable.IphoneStockObservable;
import Observable.StocksObservable;
import Observable.WindowsPhoneStockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneStockObservable();
        StocksObservable androidStockObservable = new AndroidPhoneStockObservable();
        StocksObservable windowsStockObservable = new WindowsPhoneStockObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("Shubhankit Bansal");
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("Shivangi Bansal");
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Rishabh Bansal");
        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("shubhankitbansal2016@gmail.com");
        NotificationAlertObserver observer5 = new EmailAlertObserverImpl("ankitchapparia@gmail.com");
        NotificationAlertObserver observer6 = new EmailAlertObserverImpl("govindSinghal@gmail.com");

        iphoneStockObservable.add(observer1);
        androidStockObservable.add(observer2);
        windowsStockObservable.add(observer3);
        iphoneStockObservable.add(observer4);
        iphoneStockObservable.add(observer5);
        androidStockObservable.add(observer6);

        iphoneStockObservable.setStocks(10);
        iphoneStockObservable.setStocks(0);
        iphoneStockObservable.remove(observer1);
        iphoneStockObservable.remove(observer4);
        androidStockObservable.setStocks(5);
        androidStockObservable.remove(observer6);
        windowsStockObservable.setStocks(8);
        androidStockObservable.setStocks(0);
        iphoneStockObservable.setStocks(4);
        androidStockObservable.setStocks(8);
    }
}