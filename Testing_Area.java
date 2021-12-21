import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Testing_Area here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testing_Area extends World
{
    /**
     * Constructor for objects of class Testing_Area.
     * 
     */
    public Testing_Area()
    {    
        super(600, 400, 1);
        WarBot warbot = new WarBot(0);
        Platform platform = new Platform();
        Conveyor_Left conveyorL = new Conveyor_Left();
        Conveyor_Right conveyorR = new Conveyor_Right();
        Enemy enemy = new Enemy();
        Goal goal = new Goal();
        Rules rules = new Rules();
        Hydraulic_Press press = new Hydraulic_Press();
        Incinerator incin = new Incinerator();
        addObject(new Conveyor_Left(), 157, 391);
        addObject(new Conveyor_Right(), 443, 391);
        addObject(new Platform(), 14, 392);
        addObject(new Platform(), 587, 392);
        addObject(new Platform(), 300, 392);
        addObject(new Platform(), 157, 345);
        addObject(new Conveyor_Right(), 157, 94);
        addObject(new Platform(), 299, 94);
        //addObject(new Enemy(), 299, 232);
        addObject(new Conveyor_Left(), 299, 268);
        addObject(new Hydraulic_Press(), 250, 137);
        addObject(new Hydraulic_Press(), 349, 137);
        addObject(new Platform(), 14, 94);
        addObject(goal, 52, 34);
        addObject(rules, 63, 175);
        addObject(new Platform(), 443, 219);
        addObject(new Platform(), 495, 137);
        addObject(warbot, 60, 355);
    }
}
