package structural.decorator;

import structural.decorator.inter.Beverage;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:06
 **/
public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
