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
