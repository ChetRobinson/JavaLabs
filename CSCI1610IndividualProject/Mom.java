import greenfoot.*;

/**
 * Write a description of class Mom here.
 * 
 * Shani Schneider 
 * 12/15/2015
 */
public class Mom extends Actor
{
    /**
     * Floats, slowly rotating.
     */
    public void act() 
    {
        setLocation(getX()-8, getY());
        
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }
    }    
}

