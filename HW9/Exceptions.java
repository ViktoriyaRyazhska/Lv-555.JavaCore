import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Exceptions {

	public static void main(String[] args) {
		double x = 0, y = 0;
		int start = 0, end = 0, z = 0;
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input x:");
		try {
		x = sc.nextDouble();
		System.out.println("Input y:");
		y = sc.nextDouble();
		} catch (Exception e) {
			System.err.println("Incorrect input. Try again");
		}
		div(x, y);
		try {
		
		System.out.println("Input start:");
		start = sc.nextInt();
		System.out.println("Input end:");
		end = sc.nextInt();
		System.out.println("Input numb");
		z = sc.nextInt();
			} catch (Exception e) {
				System.err.println("Incorrect input. Try again");
			}
		try {
		readNumb(start, end, z);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("input number " + i + ":");
//			arr[i] = sc.nextInt();
//		}
		
		try {
		entNumb(sc, arr);
		} catch (InputMismatchException |ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		try {
			
		Main1(arr);
//		Main2(arr);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		
		sc.close();
	}
	//Methods
	//div
	public static void div(double x, double y) {
		if (y == 0) {
			System.out.println("y = 0");
		}else {
		System.out.println(x / y);
		}
	}
	//readNumb
	public static void readNumb(int start, int end, int z) {
		if (end <= start) {
			System.out.println("End < start. Try again");
		} else {
			if (z >= start && z <= end) { 
				System.out.println(z);
			} else {
				System.out.println("Number " + z + " doesn't belong this range");;
			}
		}	
	}

	//Main
	public static void Main1(int[] arr) {
		if (arr[0] < arr[1] & arr[1] < arr[2] & arr[2] < arr[3] & arr[3] < arr[4] & arr[4] < arr[5] &
				arr[5] < arr[6] & arr[6] < arr[7] & arr[7] < arr[8] & arr[8] < arr[9] & arr[9] < 100 ) {
			System.out.println("All goog");
		} else {
			System.err.println("Something incorrect. Try again");
		}
	}
	
	public static void Main2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[i+1]) {
				System.out.println("All goog");
			} else {
				System.err.println("Something incorrect. Try again");
			}
			
		}
	}
	
	public static void entNumb(Scanner sc, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("input number " + i + ":");
			arr[i] = sc.nextInt();
		}
	}
}
