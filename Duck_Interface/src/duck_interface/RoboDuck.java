package duck_interface;

public class RoboDuck extends Duck {
    public RoboDuck(){
        doQuack = new Mute();
        doFly = new DoFlyNo();
    }
    
    public void type() {
        System.out.println("This duck is a robot.");
    }
}
