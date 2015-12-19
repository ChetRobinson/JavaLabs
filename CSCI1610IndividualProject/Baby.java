import greenfoot.*;

/**
 * Write a description of class Baby here.
 * 
 * Shani Schneider 
 * 12/15/2015
 */
public class Baby extends Actor
{
    /**
     * Act - do whatever the Baby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        
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
     * Check whether we are touching pizza, strawberries or Mom. Eat strawberries and pizza. If 
     * Mom catches you enough and makes you negative 500, game over.
     */
    private void checkCollision()
    {
        if (isTouching(Pizza.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Pizza.class);
            Brick brick = (Brick)getWorld();
            brick.addScore(20);
        }
        
        if (isTouching(Strawberry.class)) 
        {
            Greenfoot.playSound("slurp.wav");
            removeTouching(Strawberry.class);
            Brick brick = (Brick)getWorld();
            brick.addScore(20);
        }

        if (isTouching(Mom.class)) 
        {
            removeTouching(Mom.class);
            Brick brick = (Brick)getWorld();
            brick.addScore(-100);            
        }
    }
}

