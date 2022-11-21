import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    private GreenfootSound menuSound;
    
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        menuSound = new GreenfootSound("background1.wav");
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void started() {
        menuSound.playLoop();
        
    }
    
    public void stopped() {
        menuSound.stop();
    }
    
    private void prepare()
    {
        NewGame newGame = new NewGame();
        addObject(newGame,409,293);
        HowToPlay howToPlay = new HowToPlay();
        addObject(howToPlay,407,380);
        newGame.setLocation(404,299);
        newGame.setLocation(389,358);
        newGame.setLocation(408,308);
        newGame.setLocation(412,357);
        newGame.setLocation(424,395);
        newGame.setLocation(432,240);
        howToPlay.setLocation(385,426);
        newGame.setLocation(420,264);
        howToPlay.setLocation(396,382);
        newGame.setLocation(392,296);
        newGame.setLocation(456,311);
        newGame.setLocation(419,274);
        newGame.setLocation(379,278);
        newGame.setLocation(424,290);
        howToPlay.setLocation(395,367);
    }
}
