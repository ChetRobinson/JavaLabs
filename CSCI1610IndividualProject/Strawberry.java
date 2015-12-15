import greenfoot.*;

/**
 * This is a strawberry it gets eaten by the baby.
 * 
 * Shani Schneider
 * 12/15/2015
 */
public class Strawberry extends Actor
{
    private int speed;

    /**
     * Constructor: Initialise the speed to a somewhat random value.
     */
    public Strawberry()
    {
        speed = Greenfoot.getRandomNumber(5) + 1;
    }
    
    /**
     * Float along, slowly rotating.
     */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            Brick brick = (Brick)getWorld();
            brick.addScore(-15);
            brick.removeObject(this);
        }
    }
    
}
