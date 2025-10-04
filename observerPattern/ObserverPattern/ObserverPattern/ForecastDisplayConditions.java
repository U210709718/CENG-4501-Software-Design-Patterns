package ObserverPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplayConditions implements Observer {

    private List<Integer> temperatureHistory;
    private List<Integer> humidityHistory;
    private List<Integer> pressureHistory;  

    
    public ForecastDisplayConditions(Subject weatherStation) {
        temperatureHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        pressureHistory = new ArrayList<>();
        weatherStation.registerObserver(this); //register itself as an observer
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatureHistory.add((int) temp);
        this.humidityHistory.add((int) humidity);   
        this.pressureHistory.add((int) pressure);
        displayForecast();
    }
    
    public void displayForecast() {
        //Print Last 7 days History of Temperature and Humidity
        System.out.println("Temperature History: " +
                temperatureHistory.subList(Math.max(temperatureHistory.size() - 7, 0), temperatureHistory.size()));
        System.out.println("Humidity History: " +
                humidityHistory.subList(Math.max(humidityHistory.size() - 7, 0), humidityHistory.size()));

    }
    
}
