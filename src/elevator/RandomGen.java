/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;
import java.util.*;
/**
 *
 * @author Michael
 */
public class RandomGen {
     /** Creates a new instance of RandomTest */
    public RandomGen() {
    }
    
    public static void main(String[] args)
    {
        //testing random through  Random class
        
      
        long Total=0;
        double Avg = 0;
        long Num=0;
        //create random generator and set seed
        Random rndgen = new Random(System.currentTimeMillis());
        
        for(int I=0; I<10; I++)
        {
            //Generate next integer 1 to 10
            Num = rndgen.nextInt(10) + 1;
            Total += Num;
            System.out.println("Number: "+ Num);
        }
        Avg = Total/10;
        System.out.println("Average: "+ Avg);
               
        
    }
    
}
