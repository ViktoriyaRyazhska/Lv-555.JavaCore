import java.util.*;

public class Less7_2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
//      Add employee; Display on the screen		
		HashMap<Integer, String> employeeMap = new HashMap();
		employeeMap.put(23, "Roman");
		employeeMap.put(3, "Bohdan");
		employeeMap.put(6, "Andriy");
		employeeMap.put(18, "Ivanna");
		employeeMap.put(10, "Olena");
		employeeMap.put(7, "Nikita");
		employeeMap.put(12, "Oleg");
		
		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		}

//		Show key 
		System.out.println("Enter the key:");
		Integer s = sc.nextInt();
		
		if (employeeMap.containsKey(s)) {
			System.out.println("This key for key " + employeeMap.get(s));
		} else {
			System.out.println("This key is missing");
		}

//		Check name
		System.out.println("Enter the name:");
		String st =sc.next();
		if (employeeMap.containsValue(st)) {
			System.out.println("I have this name");
		} else {
			System.out.println("This name is missing");
		}

	}

}
