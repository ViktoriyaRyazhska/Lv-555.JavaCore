package lesson6.classwork6b;

public abstract class Person {

    final public String name;
    public abstract void print();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
