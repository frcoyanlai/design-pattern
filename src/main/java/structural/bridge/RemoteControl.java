package structural.bridge;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:48
 **/
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
