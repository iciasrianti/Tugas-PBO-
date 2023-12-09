import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    protected  int speed = 4; //public, private, protected -> Access Modifiers
    
    public enemy(){
        turn(180);
    }
    
    public enemy(int enemySpeed){
        turn(180);
        speed = enemySpeed;
    }
    
    public void act()
    {
        move(speed);
        if (isAtEdge()) {
       
        getWorld().removeObject(this);
        }

    }
}
