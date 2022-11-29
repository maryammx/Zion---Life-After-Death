import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends Actor
{
    /**
     * Act - do whatever the Continue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        transitionToLevel2();
    }
    
    public void transitionToLevel2() {
        //getWorld.stopped();
        if (Greenfoot.mouseClicked(this)) {
            //etWorld.stopped();
            World Level2 = new Level2();
            Level2.started();
            Greenfoot.setWorld(Level2);
        }
    }
}
