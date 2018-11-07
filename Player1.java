import greenfoot.*;

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
         public void act() 
    {
        
        
        checkKeys();
    }  
    
    
    
    public void checkKeys(){
        if (Greenfoot.isKeyDown("left")){
            turn(355);
        }
        
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        
        if (Greenfoot.isKeyDown("up")){
            move(5);
        }
        
        if (Greenfoot.isKeyDown("down")){
            move(-5);
        }
        
        if (Greenfoot.isKeyDown("space")){
            if(Greenfoot.getRandomNumber(100)>90){
            Bullet1 bullet1 = new Bullet1();
            getWorld().addObject(bullet1,getX(),getY());
            bullet1.setRotation(getRotation());
          }
        }
            //Vicente
        }
        

    } 
    
    
    
    
    
       

