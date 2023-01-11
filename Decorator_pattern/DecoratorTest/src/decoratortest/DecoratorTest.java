package decoratortest;
/**
 *
 * @author aseel-gh
 */

public class DecoratorTest {

    
    public static void main(String[] args) {
        
        // object1
        Burger burger = new BeefBurger();
        System.out.println(burger.getDescription() + " $" + burger.getCost());
        
        // object2
        Burger burger2 = new ChickenBurger();
        burger2 = new Cheese(burger2);
        System.out.println(burger2.getDescription() + " $" + burger2.getCost());
        
        // object3
        Burger burger3 = new ChickenBurger();
        burger3 = new Cheese(burger3);
        burger3 = new Pickles(burger3);
        burger3 = new Onion(burger3);
        burger3 = new Tomatos(burger3);
        burger3 = new Lettuce(burger3);
        burger3 = new Ketchup(burger3);
        burger3 = new BBQsauce(burger3);
        burger3 = new Ranchsauce(burger3);
        System.out.println(burger3.getDescription() + " $" + burger3.getCost());
        
    }
    
}
//Onion, Tomatos,Lettuce, Ketchup,BBQsauce