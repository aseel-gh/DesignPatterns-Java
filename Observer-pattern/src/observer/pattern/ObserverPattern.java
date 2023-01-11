package observer.pattern;
/**
 *
 * @author aseel-gh
 */

// test class-----------------------------------------
public class ObserverPattern {

    public static void main(String[] args) {
        CoSubject s = new CoSubject();
        Observer1 ob1= new Observer1();
        s.addObserver(ob1);
        s.notifyObserver();  
    }
    
}
