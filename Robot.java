import greenfoot.*;

/**
 * Main idea: the class robot must be able to generate a character (object) that can move and interact with other objects. So it has to "eat" all Pizza instances avoiding the obstacles. Finally touching the house the game finishes.    
 * @author (Camilo Muñoz Muñoz, Mariana Chacon y Santiago Arrieta) 
 * @version (2.0)
 */
public class Robot extends Actor {
    private int initialPositionX = 48; 
    private int initialPositionY = 50;

    /**
     * Default constructor for objects of class Robot
     */
    public Robot()
    {
    }
    
    /**
     * Act is an inherted method called by the greenfoot framework that gives actors a chance to perform some action. In this case, calls 5 methods of the class that make the robot interact with other instances. 
     */
    
    public void act() {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    
    /**
     * Moves the robot by following the arrows of the keyboard. This by calling the method  
     * Greenfoot.isKeyDown that recognizes when a specific key is pressed. Then, it use the method 
     * getX and getY to take the actual position of the instance. Next, it adds or substracts to the x or y value for changing the coordinates.
     * Finally, it use the method setLocation for setting the new x or y of the object.
    */ 
    public void robotMovement(){
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+3,getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-3,getY());
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+3);
        }
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-3);
        }
    }
    /**
     * Detects if the robot instance is touching a Wall instance. It works by using the inherited method 
     * isThouching that detects if a class is or not making contact with other specified class, in this case Wall.class.
     * Then, it sets the initial position with the method setLocation(x,y) and reproduce a sound with the method  
     * Greenfoot.playSound that uses an mp3 file. 
     */
    public void detectWallCollision(){
        if (isTouching (Wall.class)) {
        setLocation(initialPositionX,initialPositionY);
        Greenfoot.playSound("hurt.mp3");
    }
    }
    /**
     * Detects if the robot instance is touching a Block instance. It works by using the inherited method 
     * isThouching that detects if a class is or not making contact with other specified class, in this case Block.class.
     * Then, it sets the initial position with the method setLocation(x,y) and reproduce a sound with the method  
     * Greenfoot.playSound that uses an mp3 file. 
     */
    
    public void detectBlockCollision(){
        if (isTouching (Block.class)) {
        setLocation(initialPositionX,initialPositionY);
        Greenfoot.playSound("hurt.mp3");
    }
    }
    
     /**
     * Detects if the robot instance is touching a Home instance. It works by using the inherited method 
     * isThouching that detects if a class is or not making contact with other specified class, in this case Home.class.
     * Then, it sets the initial position with the method setLocation(x,y) and reproduce a sound with the method  
     * Greenfoot.playSound that uses an mp3 file. 
     */
    
    public void detectHome(){
        if (isTouching (Home.class)) {
        setLocation(initialPositionX,initialPositionY);
        Greenfoot.playSound("yipee.mp3");
    }
    }
    
     /**
     * Detects if the robot instance is touching a Pizza instance. It works by using the inherited method 
     * isThouching that detects if a class is or not making contact with other specified class, in this case Block.class.
     * Then, it sets the initial position with the method setLocation(x,y) and reproduce a sound with the method  
     * Greenfoot.playSound that uses an mp3 file. 
     */
    
    public void eatPizza(){
        if (isTouching (Pizza.class)) {
        removeTouching(Pizza.class);  
        Greenfoot.playSound("eat.mp3");
    }
    }    
    
}