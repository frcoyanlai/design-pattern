package behavioral.templatemethod;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:13
 **/
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Coffee.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Coffee.addCondiments");
    }
}
