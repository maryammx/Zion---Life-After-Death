import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
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
        demon demon = new demon();
        addObject(demon,447,230);
        demon.setLocation(343,339);
        demon.setLocation(294,339);
        demon demon2 = new demon();
        addObject(demon2,538,304);
        demon2.setLocation(487,326);
        demon2.setLocation(669,325);
        demon demon3 = new demon();
        addObject(demon3,669,325);
        demon demon4 = new demon();
        addObject(demon4,460,320);
        demon4.setLocation(467,333);
        demon2.setLocation(604,340);
        demon3.setLocation(604,344);
        removeObject(demon3);
        demon.setLocation(218,336);
        demon4.setLocation(446,334);
        demon2.setLocation(650,324);
        demon.setLocation(246,341);
        demon2.setLocation(646,321);
        demon.setLocation(238,336);
        demon4.setLocation(443,333);
        demon4.setLocation(442,332);
        demon.setLocation(201,324);
        demon4.setLocation(447,333);
        demon4.setLocation(447,320);
        demon4.setLocation(447,315);
        demon4.setLocation(446,345);
        demon4.setLocation(447,327);
        demon.setLocation(193,338);
        demon.setLocation(189,330);
        demon.setLocation(187,322);
        demon.setLocation(173,335);
        demon.setLocation(179,321);
        demon.setLocation(172,334);
        homeButton homeButton = new homeButton();
        addObject(homeButton,275,131);
        homeButton.setLocation(33,30);
        pauseButton pauseButton = new pauseButton();
        addObject(pauseButton,371,150);
        pauseButton.setLocation(105,44);
        volButton volButton = new volButton();
        addObject(volButton,629,384);
        volButton.setLocation(749,564);
        homeButton.setLocation(26,38);
        pauseButton.setLocation(92,41);
        homeButton.setLocation(44,40);
        pauseButton.setLocation(102,36);
        pauseButton.setLocation(108,38);
        volButton.setLocation(762,552);
        demon.setLocation(176,344);
        demon.setLocation(172,325);
        demon.setLocation(170,322);
        removeObject(demon);
        demon4.setLocation(324,332);
        demon4.setLocation(332,325);
    }
}
