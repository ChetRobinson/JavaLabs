import greenfoot.*;

/**
 * Write a description of class Pizza here.
 * 
 * Shani Schneider
 * 12/15/205
 */
public class Pizza extends Actor
{
    private int speed;

    /**
     * Constructor: Initialise the speed to a somewhat random value.
     */
    public Pizza()
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
