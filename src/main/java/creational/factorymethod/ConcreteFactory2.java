package creational.factorymethod;

import creational.factorymethod.inter.Factory;
import creational.factorymethod.inter.Product;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:43
 **/
public class ConcreteFactory2 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
