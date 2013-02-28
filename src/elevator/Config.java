package elevator;
class Config
{
    //alternate way to do person counter
    //way to store config items in effect globals
    
    public static final int  MAXFLOORS = 10;//treated as a constant for now
    
    public static final int TOTALBUILDINGS = 1;
    
    private static int PersonCounter = 0;
    
    public static int getPersonCounter()
    {
        return PersonCounter++;
    }
}