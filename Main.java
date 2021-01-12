import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Task: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			Task1 t1 = new Task1();
			t1.execute();
			break;
		case 2:
			Task2 t2 = new Task2();
			t2.execute();
			break;
		case 3:
			Task3 t3 = new Task3();
			t3.execute();
			break;
		case 4:
//			Task4 t4 = new Task4();
//			t4.execute();
			break;
		case 5:
			Task5 t5 = new Task5();
			t5.execute();
			break;
		case 6:
			Task6 t6 = new Task6();
			t6.execute();
			break;
		case 7:
			Task7 t7 = new Task7();
			t7.execute();
			break;
		case 8:
//			Task8 t8 = new Task8();
//			t8.execute();
			break;
		case 9:
			Task9 t9 = new Task9();
			t9.execute();
			break;
		case 10:
			Task10 t10 = new Task10();
			t10.execute();
			break;
		case 11:
			Task11 t11 = new Task11();
			t11.execute();
			break;
		case 12:
//			Task12 t12 = new Task12();
//			t12.execute();
			break;
		case 13:
//			Task13 t13 = new Task13();
//			t13.execute();
			break;
		case 14:
			Task14 t14 = new Task14();
			t14.execute();
			break;
		default:
			System.out.println("Wrong number!!!");
			break;
		}
		sc.close();
	}
}