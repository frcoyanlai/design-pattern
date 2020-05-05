package behavioral.observer.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:48
 **/
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
