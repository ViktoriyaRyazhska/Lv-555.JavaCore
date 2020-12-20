package firstPac;

import java.util.*;

public class CW07 {

	static List<Integer> myCollection = new ArrayList<>();
	static List<Integer> newCollection = new ArrayList<>();
	static Random rand = new Random();	
	
	public static void main(String[] args) {
				
		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(30));
		}
		
		System.out.println(myCollection);
		
		for (int i = 0; i < 10; i++) {
			if (myCollection.get(i) > 5) {
			newCollection.add(myCollection.get(i));
			}
		}
		
		System.out.println(newCollection);
		
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(myCollection.get(i));
			i--;
			}
		}
		//Add elements
		System.out.println(myCollection);
		addElements(myCollection, 2, 1);
		addElements(myCollection, 8, -3);
		addElements(myCollection, 5, -4);
		System.out.println(myCollection);
        		
		//Sort lists
		Collections.sort(myCollection);
		System.out.println(myCollection);
        Collections.sort(newCollection);
        System.out.println(newCollection);
		
        
       //PART 2 
                
        Map<Integer, String> employeeMap = new HashMap();
		
        employeeMap.put(1, "Alex");
        employeeMap.put(2, "Denis");
        employeeMap.put(3, "Andrew");
        employeeMap.put(4, "Roland");
        employeeMap.put(5, "Stephan");
        employeeMap.put(6, "Anna");
        employeeMap.put(7, "Elsa");
        System.out.println(employeeMap);
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter ID");
		int id = sc.nextInt();
		
		if (employeeMap.containsKey(id)) {
			System.out.println(employeeMap.get(id));
		}else {
			System.out.println("User not found");
		}
		
		System.out.println("Enter user name");
		String name = sc.next();
		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name))
					System.out.println(entry.getKey());
			}
		}else {
			System.out.println("User not found");
		}
		sc.close();
    }
	
	public static void addElements(List<Integer> arr, int i, int element){
        if(arr.size() >= i){
            arr.add(i, element);
        }
    }
}