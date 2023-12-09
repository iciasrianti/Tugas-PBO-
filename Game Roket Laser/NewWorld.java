import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    private int jeda=0;
    public NewWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        prepare();
    }
    public void test(){
        
    }
    
    private void prepare()
    {
        hero hero = new hero();
        addObject(hero,50,200);
    }
    
    int enemyTimer = 0;
    public void act()
    {
        if (enemyTimer==120){
            enemy enemy1 = new enemy();
            addObject(
                enemy1,
                590,
                Greenfoot.getRandomNumber(300) + 50
            );
            enemyTimer = 0;
        }
        
        enemyTimer++;
       
    }
}
