package ObserverPattern.ObserverPattern;

public class ForecastDisplayConditions implements Observer {
    @Override
    public void update() {
        System.out.println("Forecast Display updated");
    }
}
