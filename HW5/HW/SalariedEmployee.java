import java.util.Random;

public class SalariedEmployee extends Employee implements CalculatePay {
	private String socialSecurityNumber;
	private double fixed_monthly_payment;
	private double weight;
	@Override
	public void calculatePay() {
		System.out.println("Pay " + weight);
	}
	public SalariedEmployee(double fixed_monthly_payment) {
		this.employeeld = "SE"+ (1000 + new Random().nextInt(8999));
		this.fixed_monthly_payment = fixed_monthly_payment;
		this.weight = fixed_monthly_payment;
	}
}