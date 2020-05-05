package structural.flyweight;

import structural.flyweight.inter.Flyweight;

import java.util.HashMap;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 11:22
 **/
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
