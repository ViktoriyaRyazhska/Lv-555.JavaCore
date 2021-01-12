public class ContractEmployee extends Employee{
    private String socialSecurityNumber;
    private int paidPerHour;
    private int hoursWork;
    public ContractEmployee(String name, String employeld, String socialSecurityNumber, int paidPerHour, int hoursWork) {
        super(name, employeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.paidPerHour = paidPerHour;
        this.hoursWork = hoursWork;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return hoursWork * paidPerHour;
    }

    @Override
    public void print() {
        System.out.println("ID: " + socialSecurityNumber + " Name: " + name + " Average monthly wage: " + calculatePay());
    }
}
