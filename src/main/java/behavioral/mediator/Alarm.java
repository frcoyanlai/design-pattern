package behavioral.mediator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:33
 **/
public class Alarm extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("doAlarm()");
    }
}
