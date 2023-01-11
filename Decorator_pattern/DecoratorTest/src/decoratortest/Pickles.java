package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Pickles extends BurgerDecorator{
    
        public Pickles(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Pickles";
    }

    @Override
    public double getCost() {
        return .2 + burger.getCost();
    }
}
