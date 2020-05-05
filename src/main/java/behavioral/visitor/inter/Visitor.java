package behavioral.visitor.inter;

import behavioral.visitor.Customer;
import behavioral.visitor.Item;
import behavioral.visitor.Order;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:25
 **/
public interface Visitor {
    void visit(Customer customer);

    void visit(Order order);

    void visit(Item item);
}
