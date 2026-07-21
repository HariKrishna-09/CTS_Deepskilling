
public class WebApp implements Observer {

    @Override
    public void update(double stockPrice) {
        System.out.println("Web App Notification: Stock Price = Rs." + stockPrice);
    }
}
