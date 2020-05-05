package structural.adapter;

import structural.adapter.inter.Duck;
import structural.adapter.inter.Turkey;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:44
 **/
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
