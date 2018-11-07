import greenfoot.*;

/**
 * Write a description of class Weltraum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weltraum extends World
{
    public Player2 leo;
    public Player1 vicente;
    public Bullet1 lol;
    /**
     * Constructor for objects of class Weltraum.
     * 
     */
    public Weltraum() //leo
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 900, 1); 
        
        vicente  = new Player1();
        leo = new Player2();
        
        
        
        addObject(vicente,375,800);
        addObject(leo,375,100);
 
        
        
        
    }
}
