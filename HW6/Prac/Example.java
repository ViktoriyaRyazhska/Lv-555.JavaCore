import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class Example {
	public static void main(String... var)
	{
		List<Integer> myCollection = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myCollection.add(new Random().nextInt(100));
		}
		System.out.println("myCollection");
		System.out.println(myCollection);
		List<Integer> newCollection = new ArrayList<Integer>();
		for (Integer integer : myCollection) {
			if (integer>5)
				newCollection.add(integer);
		}
		System.out.println("newCollection");
		System.out.println(newCollection);
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i)>20) {
				myCollection.remove(myCollection.get(i));
				i--;
			}
		}
		System.out.println("myCollection");
		System.out.println(myCollection);
		tryAddVal(myCollection, 1, 1);
		tryAddVal(myCollection, 7, -3);
		tryAddVal(myCollection, 4, -4);
		System.out.println("myCollection");
		System.out.println(myCollection);
		myCollection.sort(new IntComparator());
		System.out.println("myCollection");
		System.out.println(myCollection);
		Map<Integer, String> employeeMap = new HashMap();
		for (int i = 0; i < 7; i++) {
			employeeMap.put(new Random().nextInt(1000),"Vasya"+i);
		}
		System.out.println(employeeMap);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID of user");
		int id = sc.nextInt();
		if (employeeMap.containsKey(id)) {
			System.out.println(employeeMap.get(id));
		}else {
			System.out.println("ID not found");
		}
		System.out.println("Enter user name");
		String name = sc.next();
		if (employeeMap.containsValue(name)) {
			for (Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name))
					System.out.println(entry.getKey());
			}
		}else {
			System.out.println("Name not found");
		}
		sc.close();
	}

	private static void tryAddVal(List<Integer> myCollection, int i, int j) {
		if (myCollection.size()>i)
			myCollection.add(i,j);
	}
	static class IntComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1 - o2;
		}
	}
}
