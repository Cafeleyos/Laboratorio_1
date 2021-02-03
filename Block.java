
import greenfoot.*;
/**
 * Main idea: the object rectangle rotates constantly so it removes a life from the Robot when touching it.     
 * -Actually: the object rotates and has an image associated.  
 * @author (Camilo Muñoz) 
 * @version (1.0)
 */
public class Block extends Actor 
{
    
     /**
     * Default constructor for objects of class Block
     * 
     * 
     */
    public Block()
    {
    }
    
    /**
     * The act method is called by the greenfoot framework to give actors a chance to perform some action. 
     * 
     * 
     */
    
    public void act(){
        
        turn(2);
       
    }
    
    
}
    

