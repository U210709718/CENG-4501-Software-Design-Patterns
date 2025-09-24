public class Duck {

    private FlyableBehavior flyableBehavior;


    public void setFlyableBehavior(FlyableBehavior fb) {
        flyableBehavior = fb;
    }

    public void performFly() {
        flyableBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void display() {
        System.out.println("I am a duck");
    }

}