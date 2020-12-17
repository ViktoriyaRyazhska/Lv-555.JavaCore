public class SalariedEmployee extends Employee{
    private String federalTaxIdMember;
    private int paidFixed;
    public SalariedEmployee(String name, String employeld, String federalTaxIdMember, int paidFixed) {
        super(name, employeld);
        this.federalTaxIdMember = federalTaxIdMember;
        this.paidFixed = paidFixed;
    }
    @Override
    public double calculatePay() {
        return paidFixed;
    }


    @Override
    public void print() {
        System.out.println("ID: " + federalTaxIdMember + " Name: " + name + " Average monthly wage: " + calculatePay());
    }
}