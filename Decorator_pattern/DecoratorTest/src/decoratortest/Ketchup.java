package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Ketchup extends BurgerDecorator{
    
     public Ketchup(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ketchup";
    }

    @Override
    public double getCost() {
        return .1 + burger.getCost();
    }
}
