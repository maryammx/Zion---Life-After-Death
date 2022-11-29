import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGame extends Actor
{
    private boolean isClicked;
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) 
        {
            isClicked =! isClicked;
            updateState();
            
        }
        //transitionToNewGame();
        stopMusic();
    }
    
    public void stopMusic() {
        if(Greenfoot.mouseClicked(this)) {
        getWorld().stopped();
        Greenfoot.setWorld(new Level1());
    }
    }

    public void transitionToNewGame() {
        //getWorld.stopped();
        if (Greenfoot.mouseClicked(this)) {
            //etWorld.stopped();
            World Level1 = new Level1();
            Level1.started();
            Greenfoot.setWorld(Level1);
        }
    }
    
    private void updateState()
    {

        if(isClicked)
        {
            setImage("ng2.png");
            
        }
        else
        {
            setImage("ng1.png");
        }
    }
}
