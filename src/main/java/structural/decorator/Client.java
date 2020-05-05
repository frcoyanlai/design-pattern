package structural.decorator;

import structural.decorator.inter.Beverage;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:16
 **/
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}
