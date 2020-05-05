package creational.prototype;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:02
 **/
public class Client {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype("abc");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
