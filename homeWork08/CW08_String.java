package firstPac;

import java.util.Scanner;

public class CW08_String {


		public static void main(String[] args) {
	//Task 1
		String x = "IT";
		String y = "IT Academy";
		System.out.println(y.contains(x));

	//Task 2
		System.out.println("Enter your name:");
		String[] partName = inputIn().split(" ");
		for(int i = 0; i < partName.length; i++) {
			System.out.println(partName[i]);
		}
			System.out.println(partName[0] + " " + partName[1].charAt(0) + "." + partName[2].charAt(0) + ".");
		
	//Task 3
			
			
			
	}

		
		
		public static String inputIn() {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			return name;
		}
		
}
