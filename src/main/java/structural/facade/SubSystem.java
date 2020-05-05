package structural.facade;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:18
 **/
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV()");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void startWatching(){
        System.out.println("startWatching()");
    }
}
