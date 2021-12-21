import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hydraulic_Press here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hydraulic_Press extends Danger
{
    GifImage Hydraulic_Press = new GifImage("Hydraulic_Press.gif");
    /**
     * Act - do whatever the Hydrolic_Press wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(Hydraulic_Press.getCurrentImage());
    }
}
