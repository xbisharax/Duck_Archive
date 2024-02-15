package duck_interface;

public class Mallard extends Duck{
    public Mallard(){
        doQuack = new Quack();
        doFly = new DoFlyYes();
    }
    
    public void type() {
        System.out.println("This duck is a Mallard.");
    }
}
