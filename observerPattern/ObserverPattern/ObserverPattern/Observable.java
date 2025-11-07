package ObserverPattern.ObserverPattern;

public interface Observable {
    //Observable which is obsereved by observers!
     void add(Observer o);
     void remove(Observer o);
     void broadcast();

}
