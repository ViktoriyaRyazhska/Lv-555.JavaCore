package firstPac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CW01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		
		System.out.println("input A");		
		Scanner entr = new Scanner(System.in);
		a=entr.nextInt();
		System.out.println("input B");
		b=entr.nextInt();

		System.out.println("A+B=" + (a+b));
		System.out.println("A-B=" + (a-b));
		System.out.println("A*B=" + (a*b));
		System.out.println("A/B=" + (a/b));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How are you?");
		String mood = br.readLine();
		System.out.println("You are " + mood);
	}	
}