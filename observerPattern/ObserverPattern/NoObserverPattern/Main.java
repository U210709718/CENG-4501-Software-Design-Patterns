package ObserverPattern.NoObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        CurrentDisplay currentDisplay = new CurrentDisplay();
        StaticalDisplay staticalDisplay = new StaticalDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        
        weatherStation.setMeasurements(30, 65, 1013, 10);
        System.out.println("Current conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Statical conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Forecast conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        
        weatherStation.setMeasurements(28, 70, 1012, 12);
        System.out.println("Current conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Statical conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Forecast conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        
        weatherStation.setMeasurements(25, 90, 1009, 14);
        System.out.println("Current conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Statical conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
        System.out.println("Forecast conditions: " + weatherStation.getTemperature() + "C degrees and " + weatherStation.getHumidity() + "% humidity");
    }
    
}
