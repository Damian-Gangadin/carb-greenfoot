import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends animal
{
    public Crab()
    {
        getImage().scale(100,100);
    }
    public void act()
    {
        // Add your action code here.
        checkKeyBoard();
        //isHit();
    }
    
    public void checkKeyBoard()
    {
        boolean key=Greenfoot.isKeyDown("right");
        if(key==true){
            turnTowards(getX()+2,getY());
            setLocation(getX()+2,getY());
        }
        
        key=Greenfoot.isKeyDown("left");
        if(key==true){
            turnTowards(getX()-2,getY());
            setLocation(getX()-2,getY());
        }
        
        key=Greenfoot.isKeyDown("up");
        if(key==true){
            turnTowards(getX(),getY()-2);
            setLocation(getX(),getY()-2);
        }
        
        key=Greenfoot.isKeyDown("down");
        if(key==true){
            turnTowards(getX(),getY()+2);
            setLocation(getX(),getY()+2);
        }
    }
}
