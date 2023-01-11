package decoratortest;
/**
 *
 * @author aseel-gh
 */

// adition.
public class Cheese extends BurgerDecorator{

    public Cheese(Burger burger){
        this.burger = burger;
    }

   
    @Override
    public String getDescription() {
        return burger.getDescription() + ", Chess";
    }

    @Override
    public double getCost() {
        return .5 + burger.getCost();
}

}
