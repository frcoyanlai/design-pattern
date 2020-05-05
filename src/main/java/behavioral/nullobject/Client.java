package behavioral.nullobject;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:33
 **/
public class Client {
    public static void main(String[] args) {
        AbstractOperation abstractOperation = func(-1);
        abstractOperation.request();
    }

    public static AbstractOperation func(int para) {
        if (para < 0) {
            return new NullOperation();
        }
        return new RealOperation();
    }
}
