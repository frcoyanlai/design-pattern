package behavioral.observer.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:49
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
