import java.util.Scanner;

public class Les4 {
// 1)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, a, b, c, e; String s;
		countries cou;
		
		System.out.println("Entes 3 numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		getOdd(x);
		getOdd(y);
		getOdd(z);
		
		// 2)
		System.out.println("Enter day,  Понеділок, Вівторок,  Середа.... Неділя");
		s = sc.next();
		switch (s) {
			case "Понеділок":
				System.out.println("UK: Monday");
				break;
			case "":
				System.out.println("UK: Tuesday");
				break;
			case "Середа":
				System.out.println("UK: Wednesday");
				break;
			case "Четвер":
				System.out.println("UK: Thursday");
				break;
			case "П'ятниця":
				System.out.println("UK: Friday");
				break;
			case "Субота":
				System.out.println("UK: Sutarday");
				break;
			case "Неділя":
				System.out.println("UK: Wednesday");
				break;	
		}
		// 3)
		System.out.println("Введіть країну: ");
		s = sc.next();
		switch (s) {
			case "США": case "Канада":
				System.out.println(cou = countries.NORTH_AMERIKA);
				break;
			case "Бразилія": case "Аргентина": case "Колумбія":
				System.out.println(cou = countries.SOUTH_AMERIKA);
				break;
			case "Україна": case "Індія": case "Німеччина":
				System.out.println(cou = countries.EURASIA);
				break;
			case "Гана": case "Єгипет": case "":
				System.out.println();
				break;
			case "Австралія": 
				System.out.println(cou = countries.AUSTRALIA);
				break;
			default:
				System.out.println("Не знаю такої країни");
		}
		 
		Product p1 = new Product("Rohen", 30, 1);
		Product p2 = new Product("Oranges", 80, 2);
		Product p3 = new Product("Choko-lapki", 200, 50);
		Product p4 = new Product("Multi-cake", 150, 10);
		a = p1.getPrice();
		b = p2.getPrice();
		c = p3.getPrice();
		e = p4.getPrice();
		
		if ((a > b) && (a > c) && (a > e)) {
			System.out.println("Most expensive: " + p1.getName() + " " + p1.getQua());
		} else if ((b > c) & (b > e)) {
			System.out.println("Most expensive: " + p2.getName() + " " + p2.getQua());
		} else if (c > e) {
			System.out.println("Most expensive: " + p3.getName() + " " + p3.getQua());
		} else {
			System.out.println("Most expensive: " + p4.getName() + " " + p4.getQua());
		}
	}
	
	public static void getOdd(int x) {
		if(x % 2 == 0 ) {
			System.out.println(" not Odd");
		}
		else 
			System.out.println("Odd");
	}
}
			
