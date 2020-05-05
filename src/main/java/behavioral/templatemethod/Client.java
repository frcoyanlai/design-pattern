package behavioral.templatemethod;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:14
 **/
public class Client {
    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
        System.out.println("-----------");
        caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
    }
}
