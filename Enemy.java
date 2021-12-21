import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int HP = 3;
    private int speed = 3;
    private int vSpeed = 0;
    private int acceleration = 1;
    public int r = 2;
    GifImage moveRight = new GifImage("Guy_Running(Mike Royer)Right.gif");
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(moveRight.getCurrentImage());
        die();
        onGround();
        patrol();
        getHurt();
    }
    
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    /*
     * Lets the enemy get hurt.
     */
    public void getHurt()
    {
        if(isTouching(Bullet.class))
        {
            setHP(HP--);
        }
    }
    
    /*
     * Removes the enemy if it is dead.
     */
    public void die()
    {
        if(HP <= 0)
        {
            getWorld().removeObject(this);
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
    
    /*
     * My Own AI!
     * It makes it so that the enemy stays on the platform in originally
     * was on.
     */
    public void patrol()
    {
        Actor under = getOneObjectAtOffset(2, getImage().getHeight()/2,
        Platform.class);
        move(r);
        if(onGround() == false)
        {
            r = (r) * -1;
        }
    }
    
    /*
     * Makes the enemy run.
     */
    public void run()
    {
        move(r);
    }
}
