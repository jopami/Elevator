/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author labstaff
 */
public class Elevator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person myPerson = new Person();
        myPerson.display();
        System.out.println("creating 10 persons");
        for (int I=0; I<10; I++)
        {
            myPerson = new Person();
            myPerson.display();
        }
        System.out.println("Using config data: " + Config.MAXFLOORS + " floors");
    }
}
