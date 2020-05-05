package behavioral.iterator;

import behavioral.iterator.inter.Aggregate;
import behavioral.iterator.inter.Iterator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:36
 **/
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
