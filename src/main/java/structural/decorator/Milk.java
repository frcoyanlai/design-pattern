package structural.decorator;

import structural.decorator.inter.Beverage;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:15
 **/
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
