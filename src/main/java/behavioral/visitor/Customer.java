package behavioral.visitor;

import behavioral.visitor.inter.Element;
import behavioral.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:23
 **/
public class Customer implements Element {
    private String name;
    private List<Order> orders = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void addOrder(Order order) {
        orders.add(order);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
