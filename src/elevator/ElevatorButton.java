package elevator;

/*Example of a basic data class*/
class ElevatorButton
{
    boolean bulb;

    ElevatorButton()
    {
        bulb = false; //light is on
    }

    ElevatorButton(boolean pbulb)
    {
        bulb = pbulb;
    }

    boolean getBulb()
    {
        return bulb;
    }
    void setBulb(boolean pbulb)
    {
        bulb = pbulb;
    }

    boolean isLightOn()
    {
        return bulb == true;
    }

    boolean isLightOff()
    {
        return bulb != true;
    }

    void display()
    {
        if (isLightOn())
        {
        System.out.println("Light is ON");
        }
        else
        {
            System.out.println("Light is OFF");
        }
    }
}