package duck_interface;

public class FuackPal extends Duck {
    public FuackPal() {
        doQuack = new Fuack();
        doFly = new DoFlyNo();
    }
    
    public void type(){
        System.out.println("This is a Fuack from Palpagos Islands.");
    }
}
