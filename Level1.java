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
        Zion zion = new Zion();
        addObject(zion,51,313);
        zion.setLocation(45,310);
        Ground ground = new Ground();
        addObject(ground,399,416);
        SmallBlock smallBlock = new SmallBlock();
        addObject(smallBlock,334,276);
        SmallBlock smallBlock2 = new SmallBlock();
        addObject(smallBlock2,565,171);
        Demon demon = new Demon();
        addObject(demon,328,223);
        Demon demon2 = new Demon();
        addObject(demon2,560,107);
        Demon demon3 = new Demon();
        addObject(demon3,695,358);
        Demon demon4 = new Demon();
        addObject(demon4,180,91);
    
        OraclePts oraclePts = new OraclePts();
        addObject(oraclePts,335,372);
        OraclePts oraclePts2 = new OraclePts();
        addObject(oraclePts2,761,369);
        OraclePts oraclePts3 = new OraclePts();
        addObject(oraclePts3,372,238);
        OraclePts oraclePts4 = new OraclePts();
        addObject(oraclePts4,605,140);
        OraclePts oraclePts5 = new OraclePts();
        addObject(oraclePts5,60,105);
        OraclePts oraclePts6 = new OraclePts();
        addObject(oraclePts6,752,37);
    }
}
