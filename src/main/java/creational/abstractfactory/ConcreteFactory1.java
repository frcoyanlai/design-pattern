package creational.abstractfactory;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:51
 **/
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB1();
    }
}
