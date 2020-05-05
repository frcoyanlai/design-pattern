package behavioral.strategy;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:07
 **/
public class Client {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
    }
}
