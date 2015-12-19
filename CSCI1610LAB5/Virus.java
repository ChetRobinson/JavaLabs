import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Virus floats through the blood stream. It is bad, but this virus is too strong
 * for our white blood cell: our kind of white blood cell cannot destroy it. In fact,
 * this virus destroys the white blood cell! Stay away from it.
 * 
 * Shani Schneider
 * 12-10-2015
 */
public class Virus extends Actor
{
    /**
     * Floats, slowly rotating.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
        turn(-1);
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}
