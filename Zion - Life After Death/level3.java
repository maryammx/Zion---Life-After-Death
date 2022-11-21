import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
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
        block block = new block();
        addObject(block,165,308);
        block block2 = new block();
        addObject(block2,301,248);
        block block3 = new block();
        addObject(block3,620,305);
        block block4 = new block();
        addObject(block4,692,248);
        block block5 = new block();
        addObject(block5,725,181);
        block5.setLocation(777,180);
        block5.setLocation(727,187);
        block4.setLocation(730,252);
        block5.setLocation(788,194);
        block3.setLocation(653,320);
        block4.setLocation(696,265);
        block5.setLocation(744,199);
        block2.setLocation(268,268);
        demon demon = new demon();
        addObject(demon,106,270);
        demon demon2 = new demon();
        addObject(demon2,211,230);
        demon demon3 = new demon();
        addObject(demon3,482,332);
        demon demon4 = new demon();
        addObject(demon4,639,226);
        volButton volButton = new volButton();
        addObject(volButton,756,554);
        homeButton homeButton = new homeButton();
        addObject(homeButton,47,39);
        pauseButton pauseButton = new pauseButton();
        addObject(pauseButton,115,37);
    }
}
