package StrategyPattern;

public abstract class Duck {
    //Identifiying the composition relationship!
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    abstract public void display();
    
}
