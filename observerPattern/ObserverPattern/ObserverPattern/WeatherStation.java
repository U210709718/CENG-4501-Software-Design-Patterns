package ObserverPattern.ObserverPattern;

import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Subject {
    private List<Observer> observers; //list of observers to maintain!
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); //notify all observers of the change
    }
}
