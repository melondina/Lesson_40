package hw_40;

public class Man extends Person {

    public Man(String name) {
      super(name);
    }

    @Override
    public String toString() {
        return "Мужчина по имени " + getName();
    }
}
