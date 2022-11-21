import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends Actor
{
    /**
     * Act - do whatever the HowToPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isClicked;
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
            setImage("htp2.png");
        }
        else
        {
            setImage("htp1.png");
        }
  }
}
