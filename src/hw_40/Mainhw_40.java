package hw_40;

public class Mainhw_40 {
    public static void main(String[] args) {
        Person human = new Person("Dina");
        System.out.println(human);

        human.greet();

        Person human2 = new Man("Oleg");
        System.out.println(human2);
        human2.setName("Ivan");
        System.out.println(human2);

        Person human3 = new Woman("Dina");
        System.out.println(human3);
        human3.greet();
    }
}
