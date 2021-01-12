public class SalariedEmployee extends Employee implements Calcface  {
    private double fixedPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeID,String name, double salary, String socialSecurityNumber) {
        super(employeeID,name);
        this.fixedPayment = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return fixedPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "Name =" + name +
                ", calculatePay = " + calculatePay() + '\''+
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}
