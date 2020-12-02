package firstPac;

public class CW03 {

	public static void main(String[] args) {
		//Create Employee (2 ways)
		//1st
		CW03Employee emp1 = new CW03Employee();
		emp1.setName(" Mike");
		emp1.setRate(4);
		emp1.setHours(40);
		
		//2nd
		CW03Employee emp2 = new CW03Employee("Peter", 4, 30);
		CW03Employee emp3 = new CW03Employee("  Dan", 7, 40);
		
		//print info
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println("-------------------------------");
		System.out.println("TOTAL: $" + (emp1.getTotalSum() + emp2.getTotalSum() +emp3.getTotalSum()) + " (bonuses: $" + (emp1.getBonus()+emp2.getBonus()+emp3.getBonus()) + ")");

//		CW03Employee.toSTring(emp1.getName(), emp1.getRate(), emp1.getHours());
//		CW03Employee.toSTring(emp2.getName(), emp2.getRate(), emp2.getHours());
//		CW03Employee.toSTring(emp3.getName(), emp3.getRate(), emp3.getHours());
		
	}

	
	

	
}
