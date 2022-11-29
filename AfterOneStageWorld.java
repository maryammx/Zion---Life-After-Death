import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class afterOneStageWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfterOneStageWorld extends World
{

    /**
     * Constructor for objects of class afterOneStageWorld.
     * 
     */
    public AfterOneStageWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Continue continue1= new Continue();
        addObject(continue1,400,433);
        continue1.setLocation(421,540);
    }
}
