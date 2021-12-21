import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Conveyor_Left here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Conveyor_Left extends Platform
{
    GifImage Conveyor = new GifImage("Conveyor.gif");
    /**
     * Act - do whatever the Conveyor_Left wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(Conveyor.getCurrentImage());
    }
}
