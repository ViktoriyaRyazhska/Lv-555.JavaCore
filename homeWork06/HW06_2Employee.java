package firstPac;

public class HW06_2Employee {

	public static void main(String[] args) {
		EmployeeHW06[] emp = {
                new SalariedEmployee("01", "Mike  ", "1111", 2000),
                new SalariedEmployee("02", "Damiel", "2222", 2500),
                new ContractEmployee("03", "Stan  ", "3333", 20, 160),
                new ContractEmployee("04", "David ", "4444", 20, 80)  };

        arrangeWorkers(emp);
 	}

	 public static void arrangeWorkers(EmployeeHW06[] emp){
	        for (int i = 0; i < emp.length - 1; i++) {
	            for (int j = i + 1; j < emp.length; j++) {
	                if (emp[i].calculatePay() < emp[j].calculatePay()) {
	                	EmployeeHW06 tmp = emp[i];
	                    emp[i] = emp[j];
	                    emp[j] = tmp;
	                }
	            }
	        }
	        
	       for (EmployeeHW06 i: emp){
	            System.out.println(i);
	       }
	        
//	        for (int i = 0; i < emp.length; i++) {
//	            System.out.println(emp[i]);
//	        }
	}
}
			




abstract class EmployeeHW06 implements Payable {

    public String employeeId;
    public String name;
    
	public EmployeeHW06(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
	@Override
	public String toString() {
		return "employeeId = " + employeeId + ", name = " + name + ", Salary = " + calculatePay() + "]";
	}
	
}

interface Payable {
    int calculatePay();}


class SalariedEmployee extends EmployeeHW06 {
    private String socialSecurityNumber;
    private int fixMonPay;

    public SalariedEmployee(String employeeId, String name, String number, int fixMonPay) {
        super(employeeId, name);
        this.socialSecurityNumber = number;
        this.fixMonPay = fixMonPay;    }

    public int calculatePay() {
        return fixMonPay;
    }
}


class ContractEmployee extends EmployeeHW06 {
    private String federalTaxIdmember;
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String number,int hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdmember = number;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;    }

    public int calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
