public abstract class Person {
    final public String name;

    public String getName() {
        return name;
    }

    public abstract String print();

    public Person(String name){
        this.name = name;
    }
}
