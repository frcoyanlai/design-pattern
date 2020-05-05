package behavioral.mediator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:34
 **/
public class CoffeePot extends Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("coffeePot");
    }

    public void doCoffeePot() {
        System.out.println("doCoffeePot()");
    }
}
