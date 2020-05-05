package behavioral.visitor;

import behavioral.visitor.inter.Element;
import behavioral.visitor.inter.Visitor;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:24
 **/
public class Item implements Element {
    private String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
