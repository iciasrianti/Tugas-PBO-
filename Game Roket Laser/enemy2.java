    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy2 extends enemy
{
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public enemy2(int enemySpeed){
        super.speed = enemySpeed;
        //super(enemySpeed);  
    }
    
    public void act()
    {
        super.act();
        shootLaser();
    }
    
    private int laserTimer = 0;
    private void shootLaser(){
        if (laserTimer==60){
            enemylaser el = new enemylaser();
            getWorld().addObject(el, getX(), getY());
            laserTimer = 0;
        }
        laserTimer++;
    }
}
