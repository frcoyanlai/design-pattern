package behavioral.visitor;

import behavioral.visitor.inter.Element;
import behavioral.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:24
 **/
public class Order implements Element {
    private String name;
    private List<Item> items = new ArrayList();

    Order(String name) {
        this.name = name;
    }

    Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    String getName() {
        return name;
    }

    void addItem(Item item) {
        items.add(item);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Item item : items) {
            item.accept(visitor);
        }
    }
}
