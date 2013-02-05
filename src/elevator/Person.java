package elevator;

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
         getIDNumber();//modifies iID
         iStartFloor = 0;
         iStopFloor = 0;
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
    
    void display()
    {//always using get
        System.out.println("ID is " + getID());
    }
}//end Person