package HW6_2;

public class SalariedEmployee extends Employee implements Pay {
    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + name + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", employeeld=" + employeeld +
                '}';
    }

    private String name;
    private final int fixedMonthlyPayment;

    public SalariedEmployee(String name, int employeeld,int fixedMonthlyPayment, int socialSecurityNumber) {
        super(employeeld);
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;

    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
    private final int socialSecurityNumber;
}
