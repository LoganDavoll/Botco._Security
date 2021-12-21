import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WarBot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WarBot extends Actor
{
    public int direction = 0;
    private int delayTime = 0;
    private int gunReloadTime = 10;
    private int speed = 3;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 10;
    private int HP = 100;
    public int killCount = 0;
    GifImage moveLeft = new GifImage("War-Bot_Moving(Left).gif");
    GifImage moveRight = new GifImage("War-Bot_Moving(Right).gif");
    /**
     * Act - do whatever the WarBot needs to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        conveyorLeft();
        conveyorRight();
        delayTime++;
        getHurt();
        die();
        win();
    }
    
    public WarBot(int killCount){
        this.killCount = killCount;
    }
    public int getkillCount() {
        return killCount;
    }
    public void setkillCount(int killCount) {
        this.killCount = killCount;
    }
    
    public int getdirection() {
        return direction;
    }
    public void setdirection(int direction) {
        this.direction = direction;
    }
    
    /*
     * Checks key inputs.
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage(moveRight.getCurrentImage());
            setdirection(0);
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage(moveLeft.getCurrentImage());
            setdirection(180);
        } 
        
        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
            Greenfoot.playSound("Jump.wav");
        }
        
        if ("control".equals(Greenfoot.getKey()))
        {
            shoot();
            Greenfoot.playSound("Shoot.wav");
        }
    }
    
    /*
     * Allows you to move Right.
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    /*
     * Allows you to move Left.
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    
    /*
     * Allows you to jump.
     */
    public void jump()
    {
        vSpeed = -jumpStrength - 3;
        fall();
    }
    
    /*
     * Allows you to shoot.
     */
    private void shoot() 
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY() + 6);
        if (getdirection() == 0)
        {
            bullet.setRotation(0);
        }
        if (getdirection() == 180)
        {
            bullet.setRotation(180);
        }
    }
    
    /*
     * Checks if the actor is falling or not.
     */
    public void checkFall()
    {
        if (onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
    /*
     * Checks if actor is on the ground.
     */
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(2, getImage().getHeight()/2,
        Platform.class);
        return under != null;
    }
    
    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        vSpeed += acceleration;
        detectPlatform();
    }
    
    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0,
            getImage().getHeight()/2 + i, Platform.class);
            if(under != null)
            {
                vSpeed = i - 1;
            }
        }
    }
    
    public void conveyorLeft()
    {
        Actor under = getOneObjectAtOffset(2, getImage().getHeight()/2,
        Conveyor_Left.class);
        if (under != null)
        {
            move(-2);
        }
    }
    public void conveyorRight()
    {
        Actor under = getOneObjectAtOffset(2, getImage().getHeight()/2,
        Conveyor_Right.class);
        if (under != null)
        {
            move(2);
        }
    }
    
    public void warning()
    {
        if (isTouching(Incinerator.class))
        {
            
            
        }
    }
    
    public void getHurt()
    {
        if (isTouching(Hydraulic_Press.class))
        {
            HP--;
            Greenfoot.playSound("Enemy_Hurt.wav");
        }
    }
    
    public void die()
    {
        if(HP <= 0)
        {
            Greenfoot.stop();
            Greenfoot.playSound("WarBot_Death.wav");
            setImage("download.png");
            Greenfoot.stop();
        }
    }
    
    public void nextLvl()
    {
        if (getkillCount() == 1 && getWorld() instanceof Testing_Area)
        {
           Greenfoot.setWorld(new level1());
        }
        if (getkillCount() == 2 && getWorld() instanceof level1)
        {
           Greenfoot.setWorld(new level1());
        }
    }
    
    public void win()
    {
        if(isTouching(Goal.class))
        {
            Greenfoot.stop();
            setImage("win.png");
            Greenfoot.stop();
        }
    }
}

