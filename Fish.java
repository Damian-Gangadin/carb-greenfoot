import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends animal
{
    /**
     * Act - do whatever the fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        hitEdge();
        // Add your action code here.
    }
    
    public void hitEdge(){
        if(getX()>=790 || getY()>=790 || getX()<=10 || getY()<=10){
            turn(40);
        }
    }
}
