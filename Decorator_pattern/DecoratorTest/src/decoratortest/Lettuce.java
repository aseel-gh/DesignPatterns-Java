package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Lettuce extends BurgerDecorator{
    
    public Lettuce(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Lettuce";
    }

    @Override
    public double getCost() {
        return .2 + burger.getCost();
    }
}
