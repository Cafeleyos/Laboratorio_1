import greenfoot.*;  

public class RobotWorld extends World
{

    /**
     * Author: Camilo Andres Muñoz Muñoz ---               
     * 
     * It generates a world of defined dimensions (with:800, height:600, cellsize:1) using the World class constructor and also adds
     * the instances calling the private method prepareScenario.
     */
    public RobotWorld()
    {    
        super(800, 600, 1); 
        prepareScenario();
        
    }

    /**
     *
     * It generates different instances of the classes inherted by actor and then adds them to the world
     * with the method "addObject" (inherted by the World class) that places the instance in a defined position. 
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
