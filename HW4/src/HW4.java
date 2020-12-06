import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		float x, y, z;
		int a, b, c, max, min, a1, b1, c1, s1;
		String s, n1, n2, n3;
//		HTTPError Error;
		
		Scanner sc = new Scanner(System.in);
//		1)
		System.out.println("Введіть 3 дробові(десяткові) числа");
		x = sc.nextFloat();
		y = sc.nextFloat();
		z = sc.nextFloat();
		
		belong(x);
		belong(y);
		belong(z);
//		2)
		System.out.println("Введіть 3 цілі числа");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		max = Math.max(Math.max(a, b), c);
		min = Math.min(Math.min(a, b), c);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
//		Dog d1 = new Dog();
//		Dog d2 = new Dog();
//		Dog d3 = new Dog();
//		System.out.println("Iput 3 dogs");
//		d1.input(sc);
//		d2.input(sc);
//		d3.input(sc);
		
		Dog d1 = new Dog("Tor", Breed.BULLDOG, 10);
		Dog d2 = new Dog("Reks", Breed.CHIHUAHUA, 2);
		Dog d3 = new Dog("Tor", Breed.DALMATIAN, 4);
		
		a1 = d1.getAge();
		b1 = d2.getAge();
		c1 = d3.getAge();
		n1 = d1.getName();
		n2 = d2.getName();
		n3 = d3.getName();
		
//		Oldest dog
		if ((a1 > b1) && (a1 > c1)) {
			System.out.println("The oldest:  " + d1.getName() + " " + d1.getBreed());
		} else if ((b1 > c1)) {
			System.out.println("The oldest: " + d2.getName() + " " + d2.getBreed());
		}  else {
			System.out.println("The oldest: " + d3.getName() + " " + d3.getBreed());
		}
//		3)
		System.out.println("Введіть номер помилки (400, 401, 402)");
		s1 = sc.nextInt();
		switch (s1) {
			case(400):
				System.out.println("Сервер не може обробити запрошення, відправлений клієнтом через невірний синтаксис.");
			break;
			case(401):
				System.out.println("Запит не був застосований, тому що він не має реальних діючих навчальних даних для цільового ресурсу");
			break;
			case(402):
				System.out.println("Нестандартна помилка клієнта, зарезервована для використання в майбутньому.");
			break;
			default:
				System.out.println(" Не знаю такої помилки");
		}
//		checkName
		System.out.println("Є схожі імена?");
		if (n1.equals(n2)) {
			System.out.println("Два однакові імена" + " " + d1.getName());
		} else if (n1.equalsIgnoreCase(n3)) {
			System.out.println("Два однакові імена" + " " + d1.getName());
		}	else if (n2.equalsIgnoreCase(n3)) {
				System.out.println("Два однакові імена" + " " + d2.getName());
		}  else {
			System.out.println("Немає схожих імен");
		}
	}
	public static void belong(float f) {
		if (-5 <= f && f <= 5)  {
		System.out.println("Число " + f + " належить проміжку [-5;5]");
			}
		else {
			System.out.println("Число " + f +  " не належить проміжку [-5;5]");
		}
	}
	
//	public enum HTTPError {
//		E400(),E401(), E402()
//	}
	
	
	
		
}

