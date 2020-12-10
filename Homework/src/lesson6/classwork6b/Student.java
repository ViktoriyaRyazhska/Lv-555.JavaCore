package lesson6.classwork6b;

public class Student extends Person{

    final String TYPE_PERSON = "Student";

    @Override
    public void print() {
        System.out.println("I'm a " + TYPE_PERSON);
    }

    public Student(String name) {
        super(name);
        System.out.println("Person type is " + TYPE_PERSON);
    }
}
