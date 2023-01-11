package state.pattern;
/**
 *
 * @author aseel-gh
 */

// test class ----------------------------------------------
public class StatePattern {
    
      public static void main(String[] args) {
        Order o = new Order();
        o.getStateMessage();
        o.setState(new Shipping(o));
        o.getStateMessage();
    }
    
}
