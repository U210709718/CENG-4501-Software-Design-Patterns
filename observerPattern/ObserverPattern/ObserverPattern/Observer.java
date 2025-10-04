package ObserverPattern.ObserverPattern;

public interface Observer {
    public void update(float temp, float humidity, float pressure); //this method is called when subject changes
    
}
