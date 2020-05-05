package structural.flyweight;

import structural.flyweight.inter.Flyweight;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:24
 **/
public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("aa");
        Flyweight flyweight2 = factory.getFlyweight("aa");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}
