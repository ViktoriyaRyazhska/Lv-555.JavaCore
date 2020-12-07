import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Example2 {
	public static void main(String[] args) {
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int month = sc.nextInt();
		System.out.println("This month have " + monthDays[month - 1] + " days.");
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
			arr[i] = new Random().nextInt(512) - 256;
		System.out.println(Arrays.toString(arr));
		boolean flag = true;
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0)
				flag = false;
		}
		if (flag) {
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				sum+=arr[i];
			}
			System.out.println("The sum of first 5 elements = " + sum);
		}else {
			int product = 1;
			for (int i = 4; i >= 0; i--) {
				product*=arr[i];
			}
			System.out.println("The product of last 5 element = " + product);
		}
		int[] arr2 = new int[5];
		int indePos = 0;
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = new Random().nextInt(512) - 256;
			if (arr2[i] >= 0) {
				indePos++;
				if (indePos == 2)
					System.out.println("Position of second positive number: " + (i + 1));
			}
		}
		System.out.println(Arrays.toString(arr2));
		int min = arr2[0];
		int imin = 0;
		for (int i = 1; i < arr2.length; i++) {
			if (arr2[i] < min) {
				min = arr2[i];
				imin = i + 1;
			}
		}
		System.out.println("Minimum is " + min + " and its position is " + imin + " in the array");
		int product = 1;
		int num = 0;
		while(true) {
			System.out.println("Enter number: ");
			num = sc.nextInt();
			if (num < 0)
				break;
			if (num%2 == 0)
				product*=num;
		}
		System.out.println("The product of all entered even numbers: " + product);
		Car[] arrc = {new Car("type1",1989,100),
				new Car("type1",1996,50),
				new Car("type2",1989,400),
				new Car("type2",2000,200)};
		System.out.println("Print year(1989\1996\2000): ");
		int year = sc.nextInt();
		for (int i = 0; i < arrc.length; i++) {
			if (year == arrc[i].getYear_of_production())
				System.out.println(arrc[i]);
		}
		Car tmp;
		for (int i = 0; i < arrc.length - 1; i++) {
			for (int j = i + 1; j < arrc.length; j++) {
				if (arrc[i].getYear_of_production() < arrc[j].getYear_of_production()) {
					tmp = arrc[i];
					arrc[i] = arrc[j];
					arrc[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arrc));
		sc.close();
	}
}