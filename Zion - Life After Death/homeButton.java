import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homeButton extends Actor
{
    /**
     * Act - do whatever the homeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public homeButton() {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }
}