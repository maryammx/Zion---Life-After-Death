import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zion extends Actor
{
    /**
     * Act - do whatever the zion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private GreenfootSound sound = new GreenfootSound("background1.wav");
    //private int speed = 5;
    private int vSpeed = 0;
    private int accel = 0;
    private int collectedPts;
    //private int jumpStrength = 6;
    
    public void act()
    {
        jump();
        checkFalling();
        fall();
        moveZion();
        landOnTop();
        collect();
        pause();
        if(isGameWon())
        {
            toAfterOneStage();
        }
    }

    public void moveZion() {
        if (Greenfoot.isKeyDown("a")) {
            setImage("zionL.png");
            move(-1); 
        }
        if(Greenfoot.isKeyDown("d")) {
            setImage("zionR.png");
            move(1); 
        }
        if (Greenfoot.isKeyDown("a") == false 
        && Greenfoot.isKeyDown("d") == false) {
            //sound.pause();
        }
        if("space".equals(Greenfoot.getKey()))
        {
            fire();
        }
    }

    private void fire() {
        Oracle oracle = new Oracle();
        getWorld().addObject(oracle, getX(), getY());
    }

    public void landOnTop()
    {
        if(isTouching(Ground.class))
        {
            setLocation(getX(), getY() - 1);
        }
    }

    public void fall() 
    {
        setLocation(getX(), getY() + vSpeed);
    }

    public void checkFalling() 
    {
        if(!isTouching(Ground.class))
        {
            vSpeed++;
        }
        else
            vSpeed = 0;
    }

    public void jump() 
    {
        if(Greenfoot.isKeyDown("w")) {
            vSpeed = -2;
            fall();
        }
    }

    public void collect() 
    {
        Actor oraclePts = getOneIntersectingObject(OraclePts.class);
        {if (oraclePts != null)
            {
                World world = getWorld();
                world.removeObject(oraclePts);
                collectedPts = collectedPts + 1;
            }
        }
    }

    public boolean isGameWon() 
    {
        World world = getWorld();
        if (world.getObjects(OraclePts.class).isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void toAfterOneStage() {
        getWorld().stopped();
        World afterOneStage = new AfterOneStageWorld();
        afterOneStage.started();
        Greenfoot.setWorld(afterOneStage);
    }

    public void pause() {
        if (getWorld().getObjects(pauseButton.class).get(0).paused 
        = false) 
        {
            move(5); 
        }
    }
    
    //public void jump() {
    // vSpeed = -jumpStrength;
    // fall();
    // }

    // public void checkFall() {
    // if(onGround())
    // {
    // vSpeed = 0;
    // }
    // else 
    // {
    // fall();
    // } 
    // }

    // public void fall() {
    // setLocation(getX(), getY() + vSpeed);
    // vSpeed = vSpeed + accel; 
    // }

    // public void onGround() {
    // /*sound.play();
    // //Actor under = getOneObjectAtOffset(0, getImage().getHeight() 
    // //       / 2, Block2.class);
    // //Actor under2 = getOneObjectAtOffset(0, getImage().getHeight() 
    // /// 2, block.class);

    // if (under != null)
    // return true;
    // return false; */
    // /* block block = new block();
    // if (block != null)
    // {
    // setLocation(getX(),getY()+1);
    // } 

    // return false; */

    // /* Actor under = getOneIntersectingObject(Block2.class); 
    // if (under != null)
    // {
    // //setLocation(getX(), getY()-30);
    // //vSpeed = 0;
    // return true;
    // }

    // return false;
    // //+ getImage().getHeight();
    // //return under != null; */

    // /* Actor under = getOneObjectAtOffset(0, getImage().getHeight(), 
    // Block2.class);
    // if (under != null)
    // {
    // //setLocation(getX(), getY()-30);
    // //vSpeed = 0;
    // return true;
    // } return false; */
    // }

    // public void collectOracle() {
    // if(isTouching(OraclePts.class))
    // {
    // removeTouching(OraclePts.class);
    // }
    // }

    // public void pause() {
    // if (getWorld().getObjects(pauseButton.class).get(0).paused = false);
    // move(5);
    // setRotation(rotation);

    // }
    // }
}

