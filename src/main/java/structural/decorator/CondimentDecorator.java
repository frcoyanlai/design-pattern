package structural.decorator;

import structural.decorator.inter.Beverage;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:14
 **/
public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;
}
