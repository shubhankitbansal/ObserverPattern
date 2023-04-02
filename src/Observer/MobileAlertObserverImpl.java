package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
//    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String username){
        this.username = username;
//        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update(String phoneType) {
        System.out.println( username + " : Hurry up " + phoneType + " stocks are available now");
    }

}
