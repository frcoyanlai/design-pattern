package behavioral.templatemethod;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:14
 **/
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Tea.brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea.addCondiments");
    }
}
