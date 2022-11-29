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
    //private GreenfootSound gameMusic;
    private GreenfootSound sound = new GreenfootSound("background2.wav");
    private boolean isMuted;
    private boolean musicStarted;
    public void act()
    {
        if (! musicStarted)
        {
            sound.playLoop();
            musicStarted = true;
        }
        if(Greenfoot.mouseClicked(this)) 
        {
            isMuted =! isMuted;
            updateState();
        }
    }
    
    private void updateState()
    {
        sound.playLoop();
        if(isMuted)
        {
            setImage("volumeButtonMute.png");
            sound.pause();
        }
        else
        {
            setImage("volumeButton.png");
            sound.play();
        }
    }
    
    public volButton() {
        GreenfootImage image = getImage();
        image.scale(70,70);
        setImage(image);
    }
}
