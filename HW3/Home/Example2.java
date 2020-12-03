import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("First task");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		double num;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter number:");
			num = sc.nextDouble();
			if ((num <= -5)||(num >= 5)) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Yep");
		}else {
			System.out.println("No");
		}
		int nums[] = {0,0,0};
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter number:");
			nums[i] = sc.nextInt();
		}
		int min = nums[0],max = nums[0];
		for (int i = 1; i < 3; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
		}
		System.out.println("Min = " + min + "; Max = "+max);
		System.out.println("number of HTTP Error (400, 401,402,403)"); 
		switch (sc.nextInt()) {
		case 400:
			System.out.println(HTTPError.Bad_Request);
			break;
		case 401:
			System.out.println(HTTPError.Unauthorized);
			break;
		case 402:
			System.out.println(HTTPError.Payment_Required);
			break;
		case 403:
			System.out.println(HTTPError.Forbidden);
			break;
		default:
			System.out.println("Error");
			break;
		}
		sc.close();
		System.out.println("Second task");
		Dog d1 = new Dog("Sharik",Breed.Breed1,34);
		Dog d2 = new Dog("Tusik",Breed.Breed2,20);
		Dog d3 = new Dog("Barbos",Breed.Breed3,19);
		Dog[] d = {d1,d2,d3};
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				if (d[i].getName().equals(d[j].getName())){
					System.out.println("We have dogs with same names");
					break;
				}
			}
		}
		int minAge = d[0].getAge(), minInd = 0;
		for (int i = 1; i < 3; i++) {
			if (minAge < d[i].getAge()) {
				minAge = d[i].getAge();
				minInd = i;
			}
		}
		System.out.println("The oldest dog " + d[minInd].getName() + " Breed " + d[minInd].getBreed());
	}
}