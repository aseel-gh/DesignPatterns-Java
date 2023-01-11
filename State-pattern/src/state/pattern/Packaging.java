package state.pattern;
/**
 *
 * @author aseel-gh
 */

// class Packaging ------------------------------------------
public class Packaging implements OrderState{
    Order order;
    public Packaging (Order order){
        this.order = order;
    }
    
    @Override
    public void getStateMessage(Order order){
        System.out.println("The order has been packaged");
    }
    
}
