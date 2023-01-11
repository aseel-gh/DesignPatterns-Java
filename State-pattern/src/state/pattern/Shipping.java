package state.pattern;
/**
 *
 * @author aseel-gh
 */

// class Shipping -----------------------------------------
public class Shipping implements OrderState {
    Order order;
    public Shipping (Order order){
        this.order = order;
    }
    
    @Override
    public void getStateMessage(Order order){
        System.out.println("The order has been shipped");
    }

}