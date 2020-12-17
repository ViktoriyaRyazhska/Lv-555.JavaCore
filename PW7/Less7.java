import java.util.*;

public class Less7 {

	public static void main(String[] args) {
		ArrayList<Integer> myColection = new ArrayList();
		Random rand = new Random();
		
	
		for (int i = 0; i < 10; i++) {
			myColection.add(rand.nextInt(30));
		}
		System.out.println(myColection);
//		Remove
		for (int i = 0; i < myColection.size(); i++) {
			if (myColection.get(i) > 20) {
				myColection.remove(myColection.get(i));
				i--;
			}
			
		}
		System.out.println(myColection);
		
// 			Insert elements
			if (myColection.size() > 8) {
				myColection.set(2, 1);
				myColection.set(5, -4);
				myColection.set(8, -3);
				System.out.println(myColection);
				
		} 
			
			for (int i = 0; i < myColection.size(); i++) {
				System.out.println("position = " + i + " number  = " + myColection.get(i));
			}
			
//			Sorting
			Collections.sort(myColection);
			System.out.println(myColection);
	}	
		
		
}
