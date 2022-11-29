import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class resumeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class resumeButton extends Actor
{
    /**
     * Act - do whatever the resumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        resume();
    }
    
    public void resume() {
        if (Greenfoot.mouseClicked(this)) 
        { //World world = getWorld()
            /*World pauseScreen = new pauseScreen(); //edit this
            pauseScreen.started(); */
            Greenfoot.start(); 
        }
    }
}
