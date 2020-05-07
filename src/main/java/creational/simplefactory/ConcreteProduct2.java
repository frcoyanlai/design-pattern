package creational.simplefactory;

import creational.simplefactory.inter.Product;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 11:47
 **/
public class ConcreteProduct2 implements Product {
    @Override
    public void print() {
        System.out.println("ConcreteProduct2");
    }
}
