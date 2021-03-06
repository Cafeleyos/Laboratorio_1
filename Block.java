
import greenfoot.*;
/**
 * Main idea: the object rectangle rotates constantly so it removes a life from the Robot when touching it.     
 * -Actually: the object rotates and has an image associated.  
 * @author (Santiago Arrieta) 
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
     * Act is an inherted method called by the greenfoot framework that gives actors a chance to perform some action. In this case, just calls turn  
     * (other method of the Actors class) with a 2 value for giving constant rotation. 
     * 
     */
    
    public void act(){
       
        turn(2);
    }
    
    
}
    

