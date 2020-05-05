package structural.adapter;

import structural.adapter.inter.Duck;
import structural.adapter.inter.Turkey;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:44
 **/
public class Client {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }
}
