package behavioral.strategy;

import behavioral.strategy.inter.QuackBehavior;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:07
 **/
public class Duck {
    private QuackBehavior quackBehavior;

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
