import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("First task");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter number:");
			if (sc.nextInt() % 2 == 0)
				count++;
		}
		System.out.println("odd = " + count);
		System.out.println("Second task");
		System.out.println("Enter the number of the day of the week");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("der Montag Ч lundi Ц понедельник");
			break;
		case 2:
			System.out.println("der Dienstag Ч mardi Ц вторник");
			break;
		case 3:
			System.out.println("der Mittwoch Ч mercredi Ц среда");
			break;
		case 4:
			System.out.println("der Donnerstag Ч jeudi Ц четверг");
			break;
		case 5:
			System.out.println("der Freitag Ч vendredi Ц п€тница");
			break;
		case 6:
			System.out.println("der Samstag Ч samedi Ц суббота");
			break;
		case 7:
			System.out.println("der Sonntag Ц dimanche Ц воскресенье");
			break;
			default:
				System.out.println("Error");
				break;
		}
		System.out.println("Third task");
		System.out.println("Enter the name of the country(Uganda/Australia/Vatican)");
		switch (sc.next().toLowerCase()) {
			case "uganda":
				System.out.println(Continent.Africa);
				break;
			case "australia":
				System.out.println(Continent.Australia);
				break;
			case "vatican":
				System.out.println(Continent.Europe);
				break;
			default:
				System.out.println("Error");
				break;
		}
		sc.close();
		System.out.println("Fourth task");
		Product p1 = new Product("Gvozd", 19.99, 1000);
		Product p2 = new Product("Humer", 99.99, 20);
		Product p3 = new Product("Shovel", 999.99, 5);
		Product p4 = new Product("Glove", 49.99, 10);
		Product.getExp();
		Product.getQua();
	}
}