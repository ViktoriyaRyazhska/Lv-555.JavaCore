public class ContractEmployee extends Employee implements Calcface {
    private String federalTaxIdmember;
    private double hourlyRate;
    private int workedHours;


    public ContractEmployee(String employeeID,String name, String federalTaxIdmember, double paymentPerHour, int workedHours) {
        super(employeeID, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = paymentPerHour;
        this.workedHours = workedHours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * workedHours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "Name =" + name +
                ", calculatePay = " + calculatePay() + '\'' +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}
