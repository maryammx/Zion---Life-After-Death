import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volButton extends Actor
{
    /**
     * Act - do whatever the volButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootSound sound = new GreenfootSound("playGame.wav");
    private boolean isMuted;
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) 
        {
            isMuted =! isMuted;
            updateState();
        }
    }
    
    private void updateState()
    {
        if(isMuted)
        {
            setImage("volumeButtonMute.png");
            sound.stop();
        }
        else
        {
            setImage(volButton());
            sound.play();
        }
    }
    
    public volButton() {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }
}
