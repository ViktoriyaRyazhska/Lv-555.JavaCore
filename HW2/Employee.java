public class Employee {
	private String name;
	private int rate,hours;
	private static double totalSum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		totalSum -= this.rate*this.hours;
		this.rate = rate;
		totalSum += this.rate*this.hours;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSum -= this.rate*this.hours;
		this.hours = hours;
		totalSum += this.rate*this.hours;
	}
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += rate*hours;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee() {
	}
	public int getSalary() {
		return rate*hours;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	public void changeRate(int rate){
		totalSum -= this.rate*this.hours;
		this.rate = rate;
		totalSum += this.rate*this.hours;
	}
	public void getBonuses() {
		totalSum -= this.rate*this.hours;
		totalSum += this.rate*this.hours*1.1;
	}
	public static void getTotalSum() {
		System.out.println(totalSum);
	}
}