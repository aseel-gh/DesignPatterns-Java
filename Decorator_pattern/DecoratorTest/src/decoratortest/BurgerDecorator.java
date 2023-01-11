package decoratortest;
/**
 *
 * @author aseel-gh
 */

// Decorator abstract class.
public abstract class BurgerDecorator extends Burger {
    Burger burger;

    @Override
    public abstract String getDescription();
    
    @Override
    public abstract double getCost();

}
