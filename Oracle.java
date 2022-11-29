import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Vector;

/**
 * Write a description of class oracle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oracle extends Actor
{
    private int life = Greenfoot.getRandomNumber(10) + 10;

    /**
     * Act - do whatever the oracle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        {
            move(10);
            //shootRemove();
            intersectDemon();
            //setLocation(getX() - 1, getY());
            /*if (getOneIntersectingObject(demon.class) != null) {
            getWorld().removeObject(this);
            }
            if (getWorld() != null && getX() <= 0)  {
            getWorld().removeObject(this);
            } */
             if (atWorldEdge() == true) {
                getWorld().removeObject(this);
            } 
        } 
    }

    public void intersectDemon() 
    {
        /*Actor demon = getOneIntersectingObject(Demon.class);
        Actor oracle = getOneIntersectingObject(Oracle.class);
        if(demon != null) {
        World world = getWorld();
        world.removeObject(demon);
        world.removeObject(oracle); */
        if (getOneIntersectingObject(Demon.class) != null)
        {
        //getWorld().showText("shooting: ", 300, 500);
            removeTouching(Demon.class);
            //getWorld().removeObject(Demon);
        }
        if (getWorld() != null && getX() <= 0)  {
            getWorld().removeObject(this);
        }
        //getWorld().removeObject(this);

    }


    public void shootRemove()
    {
        //setLocation(getX() - 1, getY());
        if (getOneIntersectingObject(Demon.class) != null) {
            getWorld().removeObject(this);
        }
        if (getWorld() != null && getX() <= 0)  {
            getWorld().removeObject(this);
        }
    }

    public boolean atWorldEdge() 
    {
        if(getX() == (0 | getWorld().getWidth()-1)) 
        {
            return true;
        } else {
            return false;}
    }
}

