package template_pattern;
/**
 *
 * @author aseel-gh
 */

// Test class
public class Template_pattern {
    
    public static void main(String[] args) {
        
       VehicleTemplate car1 = new car();
       car1.buildVehicle();
       
       System.out.print("\n");
       VehicleTemplate truk1 = new Truk();
       truk1.buildVehicle();
    }
    
}
