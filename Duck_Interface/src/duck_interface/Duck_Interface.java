package duck_interface;

/*
course: CSC499
project: Duck Interface
date due: 2/8/24
author: Bishara Said
purpose:

    Assume you are working on a duck information system (Mallard, Marbled, 
Canvasback, Rubber duckie, robotic duck, …) Use Java interface to create two 
protocols (interfaces: quack and fly) for each class of duck in the information 
system so that users can insert and search for duck information. Test your 
program with at least two types of ducks. Put the source code and 
screenshots of program execution in a folder called 
"yourFirstName  yourLastName Java Interface". Compress the folder into a 
zip file and upload it to Blackboard.
*/

import java.util.Scanner;

public class Duck_Interface {
    
    public static void main(String[] args) {
        
        //These will be our ducks.
        Mallard mDuck = new Mallard();
        RubberDuckie rDuck = new RubberDuckie();
        RoboDuck roboDuck = new RoboDuck();
        FuackPal fDuck = new FuackPal();
        GodlyDuck gDuck = new GodlyDuck();
        
        //menu of choices to an archive of information
        Scanner in = new Scanner(System.in);
        int choice = 0;
        System.out.println("--------Welcome to the Duck Archives!--------");
        
        //different choices will give the user different ses of information.
        do {
            System.out.println("Which duck would you like to know more about?\n"
                + "1. Mallard\n"
                + "2. Rubber Duckie\n"
                + "3. Robo Duck\n"
                + "4. Fuack\n"
                + "5. Godly Duck\n"
                + "6. Quit\n"
                + "Your choice: ");
            choice = in.nextInt();
            System.out.println("");
            
            switch(choice){
                case 1: //information about the mallard duck
                    mDuck.message();
                    mDuck.type();
                    mDuck.performFly();
                    mDuck.performQuack();
                    System.out.println("");
                    break;
                    
                case 2: //information on the rubber duckie
                    rDuck.message();
                    rDuck.type();
                    rDuck.performFly();
                    rDuck.performQuack();
                    System.out.println("");
                    break;
                    
                case 3: //informarion on the robotic duck
                    roboDuck.message();
                    roboDuck.type();
                    roboDuck.performFly();
                    roboDuck.performQuack();
                    System.out.println("");
                    break;
                    
                case 4: //information on the referenced duck, Fuack
                    fDuck.message();
                    fDuck.type();
                    fDuck.performFly();
                    fDuck.performQuack();
                    System.out.println("");
                    break;
                    
                case 5: //information on the onipotent duck, The Godly Duck
                    gDuck.message();
                    gDuck.type();
                    gDuck.performFly();
                    gDuck.performQuack();
                    System.out.println("");
                    break;
                    
                case 6: //case to quit
                    System.out.println("Thanks for checking out the Duck Archives!");
                    break;
                    
                default: //case for invalid input
                    System.out.println("Invalid choice.");
                    break;
            }
            
        } while (choice != 6);
        
    }

}
