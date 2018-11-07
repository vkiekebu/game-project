import greenfoot.*;

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends Actor
{
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(10);
        checc();
        kill();
        
    }  
    
    public void kill(){
        
     removeTouching(Player1.class);   
    }
    
    public void checc(){
        
        if(isTouching(Player1.class)==true){
            
          getWorld().addObject(new Play2(),375,450);
          Greenfoot.stop();
            
        }
        
        
    }
}
