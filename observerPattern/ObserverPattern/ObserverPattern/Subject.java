package ObserverPattern.ObserverPattern;

public interface Subject {
    //MAIN CORE INTERFACE OF SUBJECT
    public void registerObserver(Observer o); //add an observer
    public void removeObserver(Observer o); //remove an observer
    public void notifyObservers();   //this method triggers update and broadcast to all!  
}
