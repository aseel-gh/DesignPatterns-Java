package observer.pattern;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aseel-gh
 */

public class CoSubject implements Subject{
    List<Observer> Observers;

    @Override
    public void addObserver(Observer O){
        Observers.add(O);
    }

    @Override
    public void removeObserver(Observer O){
        Observers.remove(O);
    }

    @Override
    public void notifyObserver(){
        Observers.forEach(ob -> ob.update());

    }

    public CoSubject(){
        Observers= new ArrayList<Observer>();
    }
} 



