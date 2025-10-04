package ObserverPattern.ObserverPattern;

public class CurrentConditionsDisplay  implements Observer {
    private float temperature;
    private float humidity;
    
    public CurrentConditionsDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this); //register itself as an observer
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        displayCurrent();
    }
    
    public void displayCurrent() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
    
}
