package hw_40;

public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Женщина по имени " + getName();
    }
}
