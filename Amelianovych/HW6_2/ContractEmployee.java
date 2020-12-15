package HW6_2;

public class ContractEmployee extends Employee implements Pay {
    private String name;
    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber=" + socialSecurityNumber +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", employeeld=" + employeeld +
                '}';
    }

    private final int socialSecurityNumber;
    int hourlyRate;
    int numberOfHoursWorked;

    public ContractEmployee(String name, int employeeld,int socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeld);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
}
