import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Demon extends Actor
{
    /**
     * Act - do whatever the demon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int delayCount;
    private int direction = 5;
    GreenfootImage image1;
    GifImage animatedImage1;
    private int speed = 1;
    private int leftTurn = 270;
    private int rightTurn = 480;
    //private int getWorld;

    public Demon() {
        animatedImage1 = new GifImage("fireDemon2.gif");
    }

    // public boolean paused() {
        // return delayCount > 0;
    // }

    // public void setDelay(int actCount) {
        // delayCount = actCount;
    // }

    public void act()
    {   
        touch();
        pause();
        //move();
        image1 = animatedImage1.getCurrentImage();
        setImage(image1);
    }

    public void touch() {
        Actor Zion = getOneIntersectingObject(Zion.class);
        if (Zion != null) {
            World world = getWorld();
            world.removeObject(Zion);
            World gameOverWorld = new GameOverWorld();
            Greenfoot.setWorld(gameOverWorld);
        }
    }
    
    public void pause() {
        if (getWorld().getObjects(pauseButton.class).get(0).paused 
        = false) 
        {
            move(5); 
        }
    }
    
    // public boolean atTurningPoint() 
    // {
        // return (getX() <= leftTurn || getX() >= rightTurn);
    // }
    
    // public void move() 
    // {
        // setLocation ( getX() + speed, getY() );
        
        // Actor actor = getOneIntersectingObject(null);
        // if(actor != null) {
            // actor.setLocation ( actor.getX() + speed, actor.getY() );
        // }
        
        // if (atTurningPoint()) {
            // speed = -speed;
        // }
    // }
    
    /*public void move() {
        World world = getWorld();
        move(1);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            move(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= world.getWidth() - 5)
        {
            turn(90);
        }
        if (getY() <= 5 || getY() >= world.getWidth() - 5)
        {
            turn(90);
        }
        
        
    } */
    
    
    public void removeDemon() {
        
    }
}

