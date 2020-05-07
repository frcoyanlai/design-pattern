package creational.factorymethod;

import creational.factorymethod.inter.Product;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:00
 *
 * 定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。
 * 在简单工厂中，创建对象的是另一个类，而在工厂方法中，是由子类来创建对象。
 **/
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
