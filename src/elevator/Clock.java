/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author Michael
 */
public class Clock {
  private static int iCounter = 0;
  
  public void tick()
  {
      iCounter++;
  }
  public static int getTime()
  {
      return iCounter;
  }
}
