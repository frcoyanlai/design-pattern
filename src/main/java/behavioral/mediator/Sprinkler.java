package behavioral.mediator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:35
 **/
public class Sprinkler extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("sprinkler");
    }

    public void doSprinkler() {
        System.out.println("doSprinkler()");
    }
}
