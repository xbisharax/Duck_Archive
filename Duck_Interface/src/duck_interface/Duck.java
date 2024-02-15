package duck_interface;

public abstract class Duck {
    //reference variables
    DoFly doFly;
    DoQuack doQuack;
    
    public abstract void type();
    
    public void message(){
        System.out.println("--Duck Information--");
    }
    
    public void performFly() {
        doFly.fly();
    }
    
    public void performQuack() {
        doQuack.quack();
    }
    
}
