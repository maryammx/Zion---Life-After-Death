import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class demon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class demon extends Actor
{
    /**
     * Act - do whatever the demon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public demon() {
    }

    public void act()
    {  
        for (int i = 1; i < 40; i++)
        {
            move(2);
            if ((Greenfoot.getRandomNumber(100) < 200)) 
            {
                Greenfoot.delay(1);
            }
        }
        for (int i = 1; i < 40; i++)
        {
            move(-2);
            if ((Greenfoot.getRandomNumber(100) <= 200)) 
            {
                Greenfoot.delay(1);
            }
        }

    }
}

