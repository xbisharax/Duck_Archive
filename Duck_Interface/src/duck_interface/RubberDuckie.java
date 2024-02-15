package duck_interface;

public class RubberDuckie extends Duck {
    public RubberDuckie(){
        doQuack = new Squeak();
        doFly = new DoFlyNo();
    }
    
    public void type() {
        System.out.println("This duck is a rubber duckie.");
    }
}
