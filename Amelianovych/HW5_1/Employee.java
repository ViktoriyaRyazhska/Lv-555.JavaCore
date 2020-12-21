package HW5_1;

public abstract class Employee implements Pay{
    public int employeeld;
    public int getEmployed() {
        return employeeld;
    }
    public void setEmployed(int employed) {
        this.employeeld = employed;
    }
    public Employee(int employeeld){
        this.employeeld = employeeld;
    }
}
