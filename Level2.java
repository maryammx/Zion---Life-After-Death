import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
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
        Demon demon = new Demon();
        addObject(demon,447,230);
        demon.setLocation(343,339);
        demon.setLocation(294,339);
        Demon demon2 = new Demon();
        addObject(demon2,538,304);
        demon2.setLocation(487,326);
        demon2.setLocation(669,325);
        Demon demon3 = new Demon();
        addObject(demon3,669,325);
        Demon demon4 = new Demon();
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
        demon4.setLocation(361,240);
        demon2.setLocation(496,336);
        Demon demon5 = new Demon();
        addObject(demon5,659,194);
        demon5.setLocation(688,245);
        Demon demon6 = new Demon();
        addObject(demon6,740,328);
        demon6.setLocation(776,316);
        removeObject(demon6);
        demon2.setLocation(494,325);
        demon2.setLocation(494,325);
        demon5.setLocation(692,229);
        demon5.setLocation(691,243);
        demon5.setLocation(688,246);
        demon5.setLocation(681,233);
        demon5.setLocation(679,238);
        SmallBlock block = new SmallBlock();
        addObject(block,191,312);
        block.setLocation(243,318);
        SmallBlock block2 = new SmallBlock();
        addObject(block2,336,277);
        SmallBlock block3 = new SmallBlock();
        addObject(block3,677,280);
        demon2.setLocation(496,333);
        demon5.setLocation(675,252);
        block.setLocation(194,325);
        demon5.setLocation(674,235);
        demon5.setLocation(679,248);
        demon5.setLocation(678,257);
        demon5.setLocation(677,235);
        demon5.setLocation(680,246);
        demon4.setLocation(283,248);
        demon5.setLocation(629,249);
        demon4.setLocation(280,230);
        demon5.setLocation(631,235);
        demon5.setLocation(630,240);
        demon4.setLocation(281,243);
        demon4.setLocation(282,240);
        homeButton.setLocation(44, 40);
        pauseButton.setLocation(115,36);
        pauseButton.setLocation(115,36);
        pauseButton.setLocation(108, 38);
        volButton.setLocation(762, 552);
        Zion zion = new Zion();
        addObject(zion,42,320);
        Ground ground = new Ground();
        addObject(ground,789,459);
        SmallBlock smallBlock4 = new SmallBlock();
        addObject(smallBlock4,55,465);
        OraclePts oraclePts = new OraclePts();
        addObject(oraclePts,684,256);
        OraclePts oraclePts2 = new OraclePts();
        addObject(oraclePts2,357,247);
        OraclePts oraclePts3 = new OraclePts();
        addObject(oraclePts3,488,66);
        OraclePts oraclePts4 = new OraclePts();
        addObject(oraclePts4,488,66);
        OraclePts oraclePts5 = new OraclePts();
        addObject(oraclePts5,89,134);
        volButton.setLocation(762,550);
        pauseButton pauseButton2 = new pauseButton();
        addObject(pauseButton2,762,550);
        volButton.setLocation(665,484);
        removeObject(volButton);
        pauseButton2.setLocation(755,564);
        OraclePts oraclePts6 = new OraclePts();
        addObject(oraclePts6,698,425);
        Demon demon7 = new Demon();
        addObject(demon7,266,442);
        OraclePts oraclePts7 = new OraclePts();
        addObject(oraclePts7,175,296);
        removeObject(pauseButton2);
        volButton volButton2 = new volButton();
        addObject(volButton2,755,557);
    }
}
