package behavioral.observer;

import behavioral.observer.inter.Observer;
import behavioral.observer.inter.Subject;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:50
 **/
public class CurrentConditionsDisplay implements Observer {
    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}
