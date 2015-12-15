import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The brick building is the setting for the baby eating scenario. It's a place
 * where pizza, strawberries and mom's float around.
 * 
 * Shani Schneider
 * 12-15-2015
 */
public class Brick extends World
{
    private int score;
    private int time;
    
    /**
     * Constructor: Set up the starting objects.
     */
    public Brick()
    {    
        super(780, 360, 1); 
        setPaintOrder(Flower.class);
        prepare();
        score = 0;
        time = 2000;
        showScore();
        showTime();
    }

    /**
     * Create new floating objects at irregular intervals.
     */
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Pizza(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Flower(), 779, 0);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Flower(), 779, 359);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Mom(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new Strawberry(), 779, Greenfoot.getRandomNumber(360));
        }
        countTime();
    }
    
    /**
     * Add some points to our current score. (May be negative.)
     * If the score falls below 0, game's up.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < -500) 
        {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Show our current score on screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }

    /**
     * Count down the game time and display it. Stop the game 
     * with a winning message when time is up.
     */
    private void countTime()
    {
        time--;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }
    }

    /**
     * Show the remaining game time on screen.
     */
    private void showTime()
    {
        showText("Time: " + time, 700, 25);
    }
    
    /**
     * Show the end-of-game message on screen.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", 390, 150);
        showText("Your final score: " + score + " points", 390, 170);
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a baby and flowers at the edge of the screen.
     */
    private void prepare()
    {
        Baby baby = new Baby();
        addObject(baby, 128, 179);
        
        Flower flower = new Flower();
        addObject(flower, 126, 1);
        Flower flower2 = new Flower();
        addObject(flower2, 342, 5);
        Flower flower3 = new Flower();
        addObject(flower3, 589, 2);
        Flower flower4 = new Flower();
        addObject(flower4, 695, 5);
        Flower flower5 = new Flower();
        addObject(flower5, 114, 359);
        Flower flower6 = new Flower();
        Flower flower7 = new Flower();
        addObject(flower7, 295, 353);
        Flower flower8 = new Flower();
        Flower flower9 = new Flower();
        Flower flower10 = new Flower();
        addObject(flower10, 480, 358);
        Flower flower11 = new Flower();
        addObject(flower11, 596, 359);
        Flower flower12 = new Flower();
        addObject(flower12, 740, 354);
    }
}
