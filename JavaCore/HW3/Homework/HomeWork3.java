public class HomeWork3 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Andrew", "Kobryn");
        Person person3 = new Person("Pasha", "Cherepasha");
        Person person4 = new Person("Neskazhu", "Kakzovut");
        Person person5 = new Person("Mmmm","Mmmmmmmmm");
        person2.getAge(1999);

        person4.changeName("WAW","WAW");
        person4.getAge(2000);
        person4.output();
        person2.output();
    }
}

