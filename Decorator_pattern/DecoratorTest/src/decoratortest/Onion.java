package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Onion extends BurgerDecorator {
    
    public Onion(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Onion";
    }

    @Override
    public double getCost() {
       return .2 + burger.getCost();
    }
    
}
