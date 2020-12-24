import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class First {
	public static void main(String[] args) throws InterruptedException {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I study Java");
//			Thread.sleep(1000);
//		}
//		Runnable r1 = new runAB(2,"Hello, world");
//		Runnable r2 = new runAB(3,"Peace in the peace");
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println("My name is …");
		String fileName = "mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s;
			List<String> anotherList = new ArrayList<String>();
			while ((s = br.readLine()) != null) {
				anotherList.add(s);
			}
			br.close();
			int i = 0;
			int len = 0;
			String max = anotherList.get(0);
			String min = anotherList.get(0);
			for (String string : anotherList) {
				len = string.length();
				System.out.println("count="+(i+1)+" number of symbols="+len);
				if (len>max.length()) {
					max = string;
				}
				if (len<min.length()) {
					min = string;
				}
				i++;
			}
			System.out.println("longest line = "+max);
			System.out.println("shortest line = "+min);
			for (String string : anotherList) {
				if(string.indexOf("var") != - 1) {
					System.out.println(string);
				}
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
}