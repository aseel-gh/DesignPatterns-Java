package observer.pattern;
/**
 *
 * @author aseel-gh
 */

public interface Subject {
    
    public void addObserver(Observer O);
    public void removeObserver(Observer O);
    public void notifyObserver();
}
