package template_pattern;
/**
 *
 * @author aseel-gh
 */

public class car extends VehicleTemplate {
    
    @Override
     protected void assempleComponent(){
         System.out.println("Adding 3 mirrors, windows, join the parts in a car body");
     
     }
     
     @Override
     protected void installGearBox(){
         System.out.println("Installing 4 shifts gear box");
     
     }
}
