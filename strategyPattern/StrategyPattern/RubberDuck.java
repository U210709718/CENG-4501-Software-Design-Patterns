package StrategyPattern;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new NoQuackSound();
    }
    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
    
}
