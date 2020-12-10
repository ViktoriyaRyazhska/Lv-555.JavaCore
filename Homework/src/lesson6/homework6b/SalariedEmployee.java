package lesson6.homework6b;

public class SalariedEmployee extends Employee{

    private String socialSecurityNumber;
    private int fixedSalary;

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int fixedSalary) {

        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public int calculatePay() {
        return fixedSalary;
    }


}
