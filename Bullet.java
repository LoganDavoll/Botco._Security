import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends SmoothMover
{
    public int damage = 1;
    public int HP = 1;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        remove();
        HPdown();
    }
    
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void HPdown()
    {
        if (isAtEdge()==true)
        {
            HP--;
            getWorld().removeObject(this);
        }
    }
    
    public void remove()
    {
        if (HP <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
