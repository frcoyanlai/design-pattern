package structural.adapter;

import structural.adapter.inter.Turkey;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:43
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
