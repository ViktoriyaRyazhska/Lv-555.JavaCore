import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		Bird[] arr = {new Eagle(),
				new Eagle(),
				new Penguin(),
				new Eagle(),
				new Swallow(),
				new Chicken(),
				new Penguin(),
				new Swallow(),
				new Chicken(),
				new Penguin()};
		for (Bird bird : arr) {
			bird.fly();
			System.out.println(bird.toString());
		}
		Employee[] arr2 = {
				new SalariedEmployee(10000),
				new SalariedEmployee(1000),
				new ContractEmployee(590,123),
				new ContractEmployee(510,38),
				new ContractEmployee(20,60),
							};
		Arrays.sort(arr2);
		for (Employee employee : arr2) {
			System.out.println(employee.employeeld);
		}
	}
}