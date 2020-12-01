public class Example {
	public static void main(String... var)
	{
		Employee e1 = new Employee("Vasya", 1000 , 1);
		//e3.getBonuses();
		Employee e2 = new Employee("Petya", 10);
		e2.setHours(100);
		Employee e3 = new Employee();
		e3.setName("Valera");
		e3.setRate(500);
		e3.setHours(2);
		//e3.getBonuses();
		Employee.getTotalSum();
	}
}