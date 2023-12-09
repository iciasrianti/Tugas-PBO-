import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemylaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemylaser extends Actor
{
    /**
     * Act - do whatever the enemylaser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        if (isTouching(hero.class)){
            toucHero();
        }
        else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
    public void toucHero(){
        getWorld().addObject(new boom(), getX(), getY());
        removeTouching(hero.class);
        getWorld().removeObject(this);
    }
}
