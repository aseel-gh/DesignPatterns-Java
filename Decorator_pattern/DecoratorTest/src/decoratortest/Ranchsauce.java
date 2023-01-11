package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Ranchsauce extends BurgerDecorator{
    
    public Ranchsauce(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Ranchsauce";
    }

    @Override
    public double getCost() {
       return .1 + burger.getCost();
    }
    
}
