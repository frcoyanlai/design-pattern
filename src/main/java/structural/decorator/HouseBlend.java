package structural.decorator;

import structural.decorator.inter.Beverage;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:07
 **/
public class HouseBlend implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
