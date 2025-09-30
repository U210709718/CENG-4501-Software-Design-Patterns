package StrategyPattern;

public class NoQuackSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No sound");
    }
    
}
