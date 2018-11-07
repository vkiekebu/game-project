import greenfoot.*;

/**
 * Write a description of class Player2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    /**
     * Act - do whatever the Player2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
        checkKeys();
    }  
    
    
    public void checkKeys(){
        if (Greenfoot.isKeyDown("a")){
            turn(355);
        }
        
        if (Greenfoot.isKeyDown("d")){
            turn(5);
        }
        
        if (Greenfoot.isKeyDown("w")){
            move(5);
        }
        
        if (Greenfoot.isKeyDown("s")){
            move(-5);
        }
        
        if (Greenfoot.isKeyDown("r")){
            if(Greenfoot.getRandomNumber(100)>90){
            Bullet2 bullet2 = new Bullet2();
            getWorld().addObject(bullet2,getX(),getY());
            bullet2.setRotation(getRotation());
         } 
        }
        
        if (Greenfoot.getKey()=="r"){
            
            Bullet2 bullet2 = new Bullet2();
            getWorld().addObject(bullet2,getX(),getY());
            bullet2.setRotation(getRotation());
            
        }
        
    } //Leonardo
    
    
  

}
