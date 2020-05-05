package behavioral.iterator;

import behavioral.iterator.inter.Iterator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:35
 **/
public class ConcreteIterator<Item> implements Iterator {
    private Item[] items;
    private int position = 0;

    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
