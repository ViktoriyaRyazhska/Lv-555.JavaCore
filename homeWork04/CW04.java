package firstPac;
import java.util.Scanner;

public class CW04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Task #1
		for (int i = 0; i < 3; i++) {
		System.out.println("Input number:");
		int x = sc.nextInt();
		oddornot(x);
		}
		
		//Task #2
		System.out.println("Number  of day:");
		int x = sc.nextInt(); 
		dayofWeek(x);
		
		//Task #3
		System.out.println("Input Country");
		String y = sc.next().toLowerCase(); 
		country(y);
		
		sc.close();
		
		//Task #4		
		Product p1 = new Product("Apples", 2.99, 100);
		Product p2 = new Product("Oranges", 3.50, 50);
		Product p3 = new Product("Tomatos", 0.99, 1000);
		Product p4 = new Product("Candy", 5.00, 70);
		System.out.println(Product.nameMaxP + ": " + Product.maxP);
		System.out.println(Product.nameMaxQ + ": " + Product.maxQ);
		}
		
	public static void oddornot(int x) {
			if (x % 2 == 0) {
				System.out.println("ODD");
				} else {
				System.out.println("NotODD");
			}
	}

	static void dayofWeek(int x){
		switch(x){
			case 1:	System.out.println("Monday"); break;
			case 2:	System.out.println("Tuesday"); break;
			case 3:	System.out.println("Wednesday");break;
			case 4:	System.out.println("Thursday");	break;
			case 5:	System.out.println("Friday"); break;
			case 6:	System.out.println("Saturday");	break;
			case 7:	System.out.println("Sunday"); break;
			default: System.out.println("We haven't that day");
		}
	}
	
	static void country(String y) {
		switch (y) {
		case "ukraine": case "germany": case "cheh": case "poland":
			System.out.println(Cont.Europe); break;
		case "india": case "china": case "japan": 
			System.out.println(Cont.Asia); break;
		case "usa": case "canada": 
			System.out.println(Cont.NAmerica); break;
		default:
			System.out.println("I don't know :("); break;
		}
			
	}
	
public enum Cont {
		Europe, Asia, Africa, Australia, NAmerica, SAmerica, Antarctida;
	}
}


class Product {
	Product(String name, double price, int q){
		this.name = name;
		this.price = price;
		this.q = q;
		if(this.price > maxP) {
			this.maxP = price;
			this.nameMaxP = name;}
		if(this.q > maxQ) {
			this.maxQ = q;
			nameMaxQ = name;}
		}	
	String name;
	static String nameMaxP;
	static String nameMaxQ;
	static double price, maxP = 0;
	int q;
	static int maxQ = 0;

}