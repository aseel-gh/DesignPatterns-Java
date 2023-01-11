package template_pattern;
/**
 *
 * @author aseel-gh
 */

// The Template class.
public abstract class VehicleTemplate {
    
    public final void buildVehicle(){
        // steps:        
        collectComponent(); 
        assempleComponent();
        installGearBox();
        startVehicle();           
    }
    
     protected void collectComponent(){
         System.out.println("Bring rear and front light, tires, chairs"); 
     }
     
     protected abstract void assempleComponent(); 
     protected abstract void installGearBox();
     
     protected void startVehicle(){
         System.out.println("Vehicle is on"); 
     }
    
}
