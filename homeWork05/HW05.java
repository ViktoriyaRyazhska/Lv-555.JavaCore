package firstPac;

import java.util.Scanner;

public class HW05 {

	public static void main(String[] args) {
		
		//create arrays
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] arr10num = {2, 4, -4, 6, 2, -10, 11, 3, 7, -2};
		int[] arr5num = {2, 4, -4, 6, 2};
		
		Cars[] car = new Cars[4];
		car[0] = new Cars ("Ford ", 2001, 2.0);
		car[1] = new Cars ("Audi ", 2012, 3.2);
		car[2] = new Cars ("Seat ", 2008, 1.6);
		car[3] = new Cars ("Skoda", 2020, 1.8);
		
		
		
		
		
		daysOfMonth(days);
		arr10nums(arr10num);
		arr5nums(arr5num);
		entNums();
		certCar(car);
		sortCar(car);
		
		
	}

	
	//entering int
	static int inputInt() {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	return m;
	}
	
	//days of month
	static void daysOfMonth(int[] days) {
		System.out.println("Enter number of the month: ");
		int dm = days[inputInt()-1];
		System.out.println("This month have " + dm + " days.");
	}
	
	//10 numbers
	static void arr10nums(int[] arr10num){
		
		int result = 0;
		for (int i = 0; i < 5; i++) {
			
			if (arr10num[i]>0){
			result += arr10num[i];
			} else {
				result = 1;
				for (i = arr10num.length - 5; i < arr10num.length; i++) {
					result *= arr10num[i];				
				}
			}
		}
		System.out.println();
		System.out.println(result);
	}

	//5 numbers
	static void arr5nums(int[] arr5num){
		
		int min = arr5num[0];
		int i;
		int minPosition = 0;
		int countPositive = 0;
		
		//second positive position
		for (i = 0; i < 5; i++) {
			if(arr5num[i] > 0) {
				countPositive++;
				if (countPositive == 2) {
					System.out.println();
					System.out.println("Second positive: " + arr5num[i] + "; position: " + (i+1));
				}
			}
		}
		//minimum position
		for(i = 0; i < arr5num.length; i++) {
			if(min > arr5num[i]) {
				min = arr5num[i];
				minPosition = i;
			}
		}
		System.out.println();
		System.out.println("MIN " + min + "; position: " + (minPosition+1));
		System.out.println();
	}
	
	//entering positive and count even numbers
	static void entNums() {
	int product = 0;
	while(true) {
		System.out.println("Enter number: ");
		int p = inputInt();
		if (p < 0)
			break;
		if (p % 2 == 0)
			product++;
		}
	System.out.println("Quantity of even numbers: " + product);
	System.out.println();
	}
	
	
	//certain model year
	static void certCar(Cars[]car) {
	System.out.println("Please enter year (2020/2012/2008/2001)");
	int year = inputInt();
	for (int i = 0; i < car.length; i++) {
		if (year == car[i].yearProd)
			System.out.println(car[i]);
		}
	}
	
	//sorting cars by year
	static void sortCar(Cars[]car) {
		System.out.println();
		System.out.println("Sorting cars...");
		int tmp;
		for (int i = 0; i < car.length; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].yearProd < car[j].yearProd) {
				tmp = car[i].yearProd;
				car[i].yearProd = car[j].yearProd;
				car[j].yearProd = tmp;
				}
			}
		}
	for (int i = 0; i < car.length;i++) {
			System.out.println(car[i]);}
	}
}



class Cars {
	String type;
	int yearProd;
	double engineCap;

	public Cars(String type, int yearProd, double engineCap) {
		this.type = type;
		this.yearProd = yearProd;
		this.engineCap = engineCap;
	}
	@Override
	public String toString() {
		return "Car type: " + type + ", year of production: " + yearProd + ", engine capacity: "
				+ engineCap;}
}