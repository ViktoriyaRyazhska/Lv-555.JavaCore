public abstract class Employee implements Calcface {
    public String employeeID;
    public String name;


    public Employee(String employeeID,String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                '}';
    }
}
