package decoratortest;
/**
 *
 * @author aseel-gh
 */

//basic beef burger.
public class BeefBurger extends Burger{
    @Override
    public double getCost(){
        return 12;
    }

    @Override
    public String getDescription(){
        return "Beef Burger";
    }
}
