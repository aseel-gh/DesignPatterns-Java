package decoratortest;
/**
 *
 * @author aseel-gh
 */

import decoratortest.Burger;

// basic chicken burger.
public class ChickenBurger extends Burger{
     @Override
     public double getCost(){
        return 10;
    }

     @Override
    public String getDescription(){
        return "Chicken Burger";
    }
}
