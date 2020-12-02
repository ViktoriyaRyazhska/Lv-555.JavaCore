package firstPac;

public class CW03Employee {
	
	//Variables
	private String name;
	private int rate, hours;
	private double bonus, salary;
	private static double totalSum;
	
	//getters
	public String getName() {return name;}
	public int getRate() {return rate;}
	public int getHours() {return hours;}
//	public double getBonus() {return bonus;}
	
	//setters
	public void setName(String name) {this.name = name;}
	public void setRate(int rate) {this.rate = rate;}
	public void setHours(int hours) {this.hours = hours;}
	
	
	//Constructors
		public CW03Employee() {
			this.name="None";
			this.rate=0;
			this.hours=0;}
		public CW03Employee(String name, int rate) {
			this.name=name;
			this.rate=rate;
			this.hours=0;}	
		public CW03Employee(String name, int rate, int hours) {
			this.name=name;
			this.rate=rate;
			this.hours=hours;}
	
		
		
	//Methods
	double getSalary() {
		salary = this.rate * this.hours;
		return salary;
		}
	
	double getBonus() {
		if (this.hours>30) {bonus=this.salary*0.1;}
		return bonus;
		}
	
	double getTotalSum() {
		getSalary();
		getBonus();
		totalSum = salary + bonus;
		return totalSum;
		}
	
		@Override
	public String toString() {
			getTotalSum();
			return name + "; rate: " + rate + " $/hour; " + hours + " hours; " + "Salary: $" + salary + "; bonus: $" + bonus;
	}
//	public void toSTring(String name, int rate, int hours) {
//		getTotalSum();
//		System.out.println(name + "; " + rate + " $/hour; " + hours + " hours");
//		System.out.println("Salary: $" + this.salary + "; bonus: $" + this.bonus);
//		System.out.println("Total: $" + totalSum);
//		System.out.println("-------------------------");
//	}
	

}
