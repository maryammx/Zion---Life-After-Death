import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pauseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pauseButton extends Actor
{
    GreenfootImage image1 = new GreenfootImage("pause.png");
    GreenfootImage image2 = new GreenfootImage("play.png");
    boolean paused = false;
    /**
     * Act - do whatever the pauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        pause();
        //transitionToPauseMenu();
    }

    public void pause() {
        if (Greenfoot.mouseClicked(this)) 
        { //World world = getWorld();{
            if (getWorld().getObjects(pauseButton.class).get(0).paused = false)
            {
                setImage(image2);
                getWorld().getObjects(pauseButton.class).get(0).paused = true;
            }
            else
            {
                setImage(image1);
                getWorld().getObjects(pauseButton.class).get(0).paused = false;
            }
            //move(5);
            //setRotation(rotation);
            //setImage("play.png");
            //Greenfoot.stop();  
        }
    }

    /*public void transitionToPauseMenu() {
    //getWorld.stopped();
    if (Greenfoot.mouseClicked(this)) {
    //setWorld.stopped();
    World pauseScreen = new pauseScreen(); //edit this
    pauseScreen.started();
    Greenfoot.setWorld(pauseScreen);
    }
    }*/

    public pauseButton() {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }
}
