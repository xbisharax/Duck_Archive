package duck_interface;

public class GodlyDuck extends Duck {
    public GodlyDuck() {
        doQuack = new GodlyQuote();
        doFly = new Levitate();
    }
    
    public void type(){
        System.out.println("All hail the Godly duck!");
    }
}
