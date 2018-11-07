import greenfoot.*;

/**
 * Write a description of class Bullet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet1 extends Actor
{
     
    public Bullet1 bullet1;
    
    
    
    /**
     * Act - do whatever the Bullet1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
   
    
    public void act() 
    {
        
        move(10);
        checc();
        kill();
        
    } 
    
    public void kill(){
        
     removeTouching(Player2.class);   
     
    }
    
    
    public void checc(){
        
        if(isTouching(Player2.class)==true){
            
          getWorld().addObject(new Play(),375,450);
          Greenfoot.stop();
            
        }
        
        
    }
    
   // public void check(){
       
    //    if(isAtEdge()==true){
            
       //     getWorld().removeObject(Bullet1.bullet1);           
            
            
      //  }
        
        
   // }
        
    
       
        
    }

