
package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class BBQsauce extends BurgerDecorator{
    
    public BBQsauce(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", BBQsauce";
    }

    @Override
    public double getCost() {
        return .1 + burger.getCost();
    }
}
