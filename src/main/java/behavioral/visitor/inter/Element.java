package behavioral.visitor.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:21
 **/
public interface Element {
    void accept(Visitor visitor);
}
