package structural.composite;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:52
 **/
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print() {
        print(0);
    }

    abstract void print(int level);

    abstract public void add(Component component);

    abstract public void remove(Component component);
}
