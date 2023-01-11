package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Tomatos extends BurgerDecorator{
    
    public Tomatos(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Tomatos";
    }

    @Override
    public double getCost() {
        return .2 + burger.getCost();
    }
    
}
