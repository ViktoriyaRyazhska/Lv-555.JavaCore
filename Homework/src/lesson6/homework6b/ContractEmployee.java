package lesson6.homework6b;

public class ContractEmployee extends Employee {

    private String federalTaxIdmember;
    private int hourlyRate;
    private int workingHours;

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember,int hourlyRate, int workingHours)
    {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.workingHours= workingHours;
    }

    @Override
    public int calculatePay() {
        return hourlyRate * workingHours;
    }

}
