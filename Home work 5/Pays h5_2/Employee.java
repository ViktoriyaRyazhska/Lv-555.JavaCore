public abstract class Employee implements Pay{
    final public String employeld;
    final public String name;
    public Employee(String name, String employeld){
        this.employeld = employeld;
        this.name = name;
    }
    public abstract void print();

}