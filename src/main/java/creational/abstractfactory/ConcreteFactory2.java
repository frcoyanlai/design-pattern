package creational.abstractfactory;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:52
 **/
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
