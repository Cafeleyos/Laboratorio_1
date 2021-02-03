import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RobotWorld extends World
{

    /**
     * Autor: Camilo Andres Muñoz Muñoz 
     * 
     */
    public RobotWorld()
    {    
        super(800, 600, 1); 
        prepareScenario();
    }

    /**
     *
     * Method that adds the objects to the world
     */
    
     private void prepareScenario()
    {
        addObject(new Robot(),48,50);
        
        addObject(new Block(),427,145);
        
        int[][] a = {{52,147},{159,147},{266,147},{587,147},{692,147},{791,147}};
        for (int i=0; i< a.length;i++){
            addObject(new Wall(),a[i][0],a[i][1]);
        }
        
        addObject(new Home(),751,552);
        
        addObject(new ScorePanel(),71,554);
        
        addObject(new Pizza(),720,46);
        addObject(new Pizza(),443,38);
        addObject(new Pizza(),183,302);
        addObject(new Pizza(),417,537);
        addObject(new Pizza(),682,312);
        
    }
}
