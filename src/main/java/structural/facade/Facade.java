package structural.facade;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:19
 **/
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("a movie");
        subSystem.startWatching();
    }
}
