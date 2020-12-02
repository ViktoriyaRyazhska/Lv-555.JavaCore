package firstPac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW01 {

	public static void main(String[] args) throws IOException {
		double pi=3.14;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What radius of flowed bed?");
		int r = Integer.parseInt(br.readLine());
		System.out.println("Perimeter is " + (2*pi*r));
		System.out.println("Area is " + (pi*r*r));
		
		String name, address;
		System.out.println("What is your name?");
		name = br.readLine();
		System.out.println("Where are you live, " + name + "?");
		address = br.readLine();
		
		int c1, c2, c3, t1, t2, t3;
		
		System.out.println("How much does a minute call cost to the USA?");
		c1 = Integer.parseInt(br.readLine());
		System.out.println("How much does a minute call cost to the UK?");
		c2 = Integer.parseInt(br.readLine());
		System.out.println("How much does a minute call cost to Italy?");
		c3 = Integer.parseInt(br.readLine());
		
		System.out.println("How long the conversation was from the USA?");
		t1 = Integer.parseInt(br.readLine());
		System.out.println("How long the conversation was from the UK?");
		t2 = Integer.parseInt(br.readLine());
		System.out.println("How long the conversation was from Italy?");
		t3 = Integer.parseInt(br.readLine());
		
		System.out.println("Call cost to the USA " + (c1*t1));
		System.out.println("all cost to the UK " + (c2*t2));
		System.out.println("all cost to Italy " + (c3*t3));
		System.out.println("Total cost " + (c1*t1+c2*t2+c3*t3));
	}

}
