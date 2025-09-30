public class Main {
    public static void main(String[] args) {
        MallardDuck duck1 = new MallardDuck();
        duck1.display();
        duck1.quack();
        duck1.swim();
        duck1.fly();   

        System.out.println("***********************");
        
        RedHeadDuck duck2 = new RedHeadDuck();
        duck2.display();
        duck2.quack();
        duck2.swim();
        duck2.fly();

        System.out.println("***********************");

        RubberDuck duck3 = new RubberDuck();
        duck3.display();
        duck3.quack();
        duck3.swim();
        duck3.fly();  
        
        System.out.println("***********************");  
    
        
    }
}
