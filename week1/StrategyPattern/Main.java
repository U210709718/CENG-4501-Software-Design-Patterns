public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck readhead = new ReadHeadDuck();
        Duck rubber = new RubberDuck();

        mallard.performFly();
        readhead.performFly();
        rubber.performFly();

        mallard.setFlyableBehavior(new FlywithWings());
        mallard.performFly();
        rubber.setFlyableBehavior(new FlyNoWay());
        rubber.performFly();
        

    }

}
