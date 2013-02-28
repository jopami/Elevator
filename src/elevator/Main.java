/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package elevator;
import java.util.*;
/**
 *
 * @author rgouveia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //testing Light
        //ElevatorButton myLight = new ElevatorButton();
        //myLight.display();
        //ElevatorButton myLight1 = new ElevatorButton(false);
        //myLight1.display();
        //test get
        //System.out.println("Bulb value is " + myLight.getBulb());
        //test set
        //myLight.setBulb(false);
        //System.out.println("Bulb value is " + myLight.getBulb());
        
        for (int i=0; i<10; i++)//person create test
        {
        Person myPerson = new Person();
        //myPerson.setStartFloor(1);
        myPerson.display();
        }
        
        
    }

}
