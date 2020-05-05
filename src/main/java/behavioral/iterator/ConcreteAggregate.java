package behavioral.iterator;

import behavioral.iterator.inter.Aggregate;
import behavioral.iterator.inter.Iterator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:34
 **/
public class ConcreteAggregate implements Aggregate {
    private Integer[] items;

    public ConcreteAggregate() {
        items = new Integer[10];
        for (int i = 0; i < items.length; i++) {
            items[i] = i;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator<Integer>(items);
    }
}
