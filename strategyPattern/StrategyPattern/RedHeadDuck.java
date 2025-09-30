package StrategyPattern;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackSound();
    }
    @Override
    public void display() {
        System.out.println("Displaying Red Head Duck");
    }
    
}
