import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Incinerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Incinerator extends Danger
{
    /**
     * Act - do whatever the Incinerator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        warning();
    }
    
    public void warning()
    {
        if(isTouching(WarBot.class))
        {
            Greenfoot.playSound("Factory Alarm Sound.mp3");
        }
    }
}
