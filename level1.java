import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        super(600, 400, 1); 
        WarBot warbot = new WarBot(0);
        Platform platform = new Platform();
        Conveyor_Left conveyorL = new Conveyor_Left();
        Conveyor_Right conveyorR = new Conveyor_Right();
        Enemy enemy = new Enemy();
        Hydraulic_Press hydraulicPress = new Hydraulic_Press();
        Incinerator incin = new Incinerator();
        addObject(new Platform(), 157, 392);
        addObject(new Platform(), 443, 392);
        addObject(new Platform(), 14, 392);
        addObject(new Platform(), 586, 392);
        addObject(new Platform(), 300, 392);
        addObject(new WarBot(0), 60, 355);
        addObject(new Enemy(), 297, 355);
    }
}
