package behavioral.iterator.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:35
 **/
public interface Iterator<Item> {
    Item next();

    boolean hasNext();
}
