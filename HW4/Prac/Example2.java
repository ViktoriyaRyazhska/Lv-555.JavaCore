import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
			arr[i] = new Random().nextInt(512) - 256;
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int imax = 0;
		int sum = 0;
		int amount = 0;
		int ii = 0;
		while (ii < arr.length) {
			sum += arr[ii];
			if (arr[ii] < 0)
				amount++;
			if (arr[ii] > max) {
				max = arr[ii];
				imax = ii;
			}
			ii++;
		}
		System.out.println("The biggest of these numbers: " + arr[imax]);
		System.out.println("The sum of positive numbers in the array: " + sum);
		System.out.println("The amount of negative numbers in the array: " + amount);
		if (amount > 5) {
			System.out.println("Nagtive more");
		}else {
			System.out.println("Positive more");
		}
		Scanner sc = new Scanner(System.in);
		Employee[] arre = {new Employee("Vasya",12,123.90),
				new Employee("Petya",12,581.90),
				new Employee("Nastya",5,300.90),
				new Employee("Kristina",12,200.90),
				new Employee("Kolya",16,900.90)};
		System.out.println("Print department");
		int dep = sc.nextInt();
		for (int j = 0; j < arre.length; j++)
			if (arre[j].getDepartment_number() == dep)
				System.out.println(arre[j]);
		Employee tmp;
		for (int i = 0; i < arre.length - 1; i++) {
			for (int j = i + 1; j < arre.length; j++) {
				if (arre[i].getSalary() < arre[j].getSalary()) {
					tmp = arre[i];
					arre[i] = arre[j];
					arre[j] = tmp;
				}
			}
		}
		System.out.println("Workers by the field salary in descending order");
		for (int i = 0; i < arre.length; i++) {
			System.out.println(arre[i]);
		}
		sc.close();
	}
}