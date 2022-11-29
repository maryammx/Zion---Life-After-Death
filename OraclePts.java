import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OraclePts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class OraclePts extends Actor
{
    GreenfootImage image1;
    GifImage animatedImage1;
    /**
     * Act - do whatever the OraclePts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public OraclePts() {
        animatedImage1 = new GifImage("oracle2.gif");
    }
    public void act()
    {
        image1 = animatedImage1.getCurrentImage();
        setImage(image1);
    }
}
