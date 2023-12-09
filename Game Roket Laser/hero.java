import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    private int targetx=0,targety=0;
    private int jeda=0;

    public void act()
    {
        move(4);
        if (isAtEdge()){
            setLocation(0, getY());
        }
        
        heroMovement();
        
        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new laser(),getX()+100,getY());
        if(jeda==0)jeda=15;

    }
    
    public void heroMovement(){
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX()+3, getY()); //50,200
        } else if (Greenfoot.isKeyDown("A")){
            setLocation(getX()-3, getY()); 
        }
        
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-3); 
        } else if (Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY()+3); 
        }
    }
    
    int laserTimer = 0;
    public void shootLaser(){
        if(laserTimer==30){
        laser laser = new laser();
            getWorld().addObject(
                laser,
                getX()+10,
                getY()
            );
            laserTimer =0;
        }
        
        laserTimer++;
    }
}
