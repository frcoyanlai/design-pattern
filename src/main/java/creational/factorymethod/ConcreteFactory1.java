package creational.factorymethod;

import creational.factorymethod.inter.Factory;
import creational.factorymethod.inter.Product;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:42
 **/
public class ConcreteFactory1 extends Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
