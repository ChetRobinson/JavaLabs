import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch bacteria and
 * remove them from the blood.
 * 
 * Shani Schneider
 * 12-10-2015
 */
public class WhiteCell extends Actor
{
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-8);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+8);
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
    }
    
    /**
     * Check whether we are touching a bacterium or virus. Remove bacteria.
     * Game over if we hit a virus.
     */
    private void checkCollision()
    {
        if (isTouching(Bacteria.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Bacteria.class);
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(20);
        }

        if (isTouching(Virus.class)) 
        {
            removeTouching(Virus.class);
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(-100);            
        }
    }
}
