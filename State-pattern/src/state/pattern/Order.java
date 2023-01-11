package state.pattern;
/**
 *
 * @author aseel-gh
 */

// class order---------------------------------------------
public class Order {
    OrderState orderstate;

    public Order(){
        orderstate = new Packaging(this);
   
    }

    public void setState (OrderState state){
        this.orderstate = state;
    }

    public void getStateMessage(){
        orderstate.getStateMessage(this);
    }
}
