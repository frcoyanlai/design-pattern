package structural.bridge;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:47
 **/
public class Sony extends TV {
    @Override
    public void on() {
        System.out.println("Sony.on()");
    }

    @Override
    public void off() {
        System.out.println("Sony.off()");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Sony.tuneChannel()");
    }
}
