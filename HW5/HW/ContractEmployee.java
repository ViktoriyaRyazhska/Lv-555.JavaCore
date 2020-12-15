import java.util.Random;

public class ContractEmployee extends Employee implements CalculatePay {
	private String federalTaxIdmember;
	private double hourly_rate;
	private int number_of_hours_worked;
	private double weight;
	@Override
	public void calculatePay() {
		System.out.println("Pay " + weight);
	}
	public ContractEmployee(double hourly_rate, int number_of_hours_worked) {
		this.employeeld = "CE"+ (1000 + new Random().nextInt(8999));
		this.hourly_rate = hourly_rate;
		this.number_of_hours_worked = number_of_hours_worked;
		this.weight = hourly_rate * number_of_hours_worked;
	}
}