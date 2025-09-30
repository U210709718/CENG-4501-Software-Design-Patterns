package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.flyBehavior.fly();
        mallard.quackBehavior.quack();

        RedHeadDuck redhead = new RedHeadDuck();
        redhead.display();
        redhead.flyBehavior.fly();
        redhead.quackBehavior.quack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.flyBehavior.fly();
        rubberDuck.quackBehavior.quack();
    }
    
}
