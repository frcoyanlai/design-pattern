package creational.simplefactory;

import creational.simplefactory.inter.Product;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 11:58
 **/
public class Client {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(2);
        product.print();
        // do something with the product

    }
}
