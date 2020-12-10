package lesson6.homework6b;

public abstract class Employee implements Payable{

    final public String employeeId;
    final public String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                this.getClass().getSimpleName()+
                " employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", average monthly wage ='" + this.calculatePay() + '\'' +
                '}';
    }
}
