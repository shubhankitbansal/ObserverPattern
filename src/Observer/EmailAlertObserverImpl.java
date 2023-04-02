package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
//    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId){
        this.emailId = emailId;
//        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update(String phoneType) {
        System.out.println( emailId + " : Hurry up " + phoneType + " stocks are available now");
    }
}
