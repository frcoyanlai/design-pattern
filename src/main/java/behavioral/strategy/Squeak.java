package behavioral.strategy;

import behavioral.strategy.inter.QuackBehavior;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:06
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
