package ObserverPattern.NoObserverPattern;

public class WeatherStation {
    int temperature;
    int humidity;
    int pressure;
    int windSpeed;
    
    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;   
    }    
    public int getPressure() {
        return pressure;
    }
    public int getWindSpeed() {
        return windSpeed;   
    }
    public void setMeasurements(int temperature, int humidity, int pressure, int windSpeed) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
    }
    
}
