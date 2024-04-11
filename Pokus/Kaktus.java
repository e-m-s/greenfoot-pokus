import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kaktus here.
 * 
 * @author Martin Šimůnek
 * @version 2024-04-11
 */
public class Kaktus extends Actor
{
    private int rychlost = 3;
    
    public void act()
    {
        move(rychlost);
        
        if (isAtEdge())
        {
            int randomY = Greenfoot.getRandomNumber(getWorld().getHeight());
            rychlost = Greenfoot.getRandomNumber(5)+1;
            setLocation(0, randomY);
        }
    }
}
