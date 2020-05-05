package creational.builder;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:57
 **/
public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
