
public class ContractEmployee extends Employee{
    private String socialSecurityNumber;
    private double paidPerHour;
    private int hoursWork;
    public ContractEmployee(String name, String employeld, String socialSecurityNumber, double paidPerHour, int hoursWork) {
        super(name, employeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.paidPerHour = paidPerHour;
        this.hoursWork = hoursWork;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hoursWork * paidPerHour;
    }

    @Override
    public void print() {
        System.out.println("ID: " + socialSecurityNumber + " Name: " + name + " Average monthly wage: " + calculatePay());
    }
}