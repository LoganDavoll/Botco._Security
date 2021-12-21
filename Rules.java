import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rules extends Actor
{
    public Rules()
    {
        GreenfootImage img = new GreenfootImage(125, 135);
        img.drawString("Move with [<-] & [->]", 2, 10);
        img.drawString("Jump with [Space]", 2, 40);
        img.drawString("Shoot using [Control]", 2, 70);
        img.drawString("Don't get Crushed", 2, 100);
        img.drawString("Get to A-002 to Win", 2, 130);
        //img.drawString("Kill the Intruders", 2, 100);
        setImage(img);
    }
    /**
     * Act - do whatever the Rules wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
