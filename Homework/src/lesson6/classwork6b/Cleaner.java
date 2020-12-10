package lesson6.classwork6b;

public class Cleaner extends Staff{

    final String TYPE_PERSON = "Cleaner";

    @Override
    public int salary() {
        System.out.println("My salary is 100$");
        return 100;
    }

    @Override
    public void print() {
        System.out.println("I'm a " + TYPE_PERSON);
    }

    public Cleaner(String name) {
        super(name);
        System.out.println("Person type is " + TYPE_PERSON);
    }
}
