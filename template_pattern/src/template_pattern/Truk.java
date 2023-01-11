package template_pattern;
/**
 *
 * @author aseel-gh
 */

public class Truk extends VehicleTemplate{
    
     @Override
     protected void assempleComponent(){
         System.out.println("Adding extra truk container");
     
     }
     
     @Override
     protected void installGearBox(){
         System.out.println("Installing 6 shifts gear box");
     
     }
}
