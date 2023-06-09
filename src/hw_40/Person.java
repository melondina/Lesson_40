package hw_40;

public class Person {

    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Человек по имени " + name;
    }

    public void greet() {
        System.out.println("Я родился!");
    }
}
