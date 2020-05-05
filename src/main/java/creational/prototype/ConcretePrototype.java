package creational.prototype;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:01
 **/
public class ConcretePrototype extends Prototype {

    private String filed;

    public ConcretePrototype(String filed) {
        this.filed = filed;
    }

    @Override
    Prototype myClone() {
        return new ConcretePrototype(filed);
    }

    @Override
    public String toString() {
        return filed;
    }
}
