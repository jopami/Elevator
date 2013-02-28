package elevator;
import java.util.*;

class Person
{
    //using prefixes and initializing
    int iID = 0;
    int iStartFloor = 0;
    int iStopFloor = 0;
    int iStartTime = 0;
    int iEndTime = 0;
    
    //Adding counter as static class property
    static int Counter = 0;
    
    Person ()
    {
         Random rndGen = new Random(System.currentTimeMillis()); //Generate Random Number
         
         getIDNumber();//modifies iID
         iStartFloor = rndGen.nextInt(10) + 1;
         iStopFloor = rndGen.nextInt(10) + 1;
         iStartTime = 0;
         iEndTime = 0;
    }
    
    int getID()
    {
        return iID;
    }
    
    void setID(int piID)
    {
        iID = piID;
    }
    
    //way to access counter
    void getIDNumber()
    {
        //iID = Counter ++;
        iID = Config.getPersonCounter();
    }
    
    void setStartFloor(int pStart)
    {
        iStartFloor = pStart;
    }
    
    int getStartFloor()
    {
        return iStartFloor;
    }
    
    void setStopFloor(int pStop)
    {
        iStopFloor = pStop;
    }
    
    int getStopFloor()
    {
        return iStopFloor;
    }
    
    boolean isGoingUp() //if true is going up, false down
    {
        return(iStartFloor < iStopFloor);
    }
    
    void display()
    {//always using get
        System.out.println("ID is " + getID());
        System.out.println("Start is " + getStartFloor());
        System.out.println("Stop is " + getStopFloor());
        System.out.println("Is going Up = " + isGoingUp());
    }
}//end Person