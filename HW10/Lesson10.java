import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;




public final class Lesson10 {

	public static void main(String[] args) throws InterruptedException, IOException {
// 		Task 1
		
//		Runnable r1 = new First(1, "Theard_1");
//		Runnable r2 = new First(2, "Theard_2");
//		Runnable r3 = new First(1, "Theard_3");
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		Thread t3 = new Thread(r3);
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		t3.start();
//		System.out.println("Main");
		
//		Task 4		
		
		File file1 = new File("file1.txt");
		File file2 = new File("file2.txt");
		
		file1.createNewFile();
		file2.createNewFile();
		
		String filename = "file1.txt";
		FileReader fr = null;
		BufferedReader br = null;
		PrintWriter pw = new PrintWriter(file2);
		String iam = "Bohdan Melnyk: 24.02.1998";
		try {
			List<String> text = new ArrayList<>();
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String s = null;
			System.out.println("Read text from " + filename);
			while((s = br.readLine()) != null) {
				text.add(s);
			}
			br.close();
			int len = 0;
			String max = text.get(0);
			for (String str : text) {
				len = str.length();
				if(len > max.length()) {
					max = str;
				}
				
			}
			
			long sum = 0;
			for (int i = 0; i < text.size(); i++) {
				sum = text.stream().count();
			}
			System.out.println("Number of lines: " + sum);
			fr.close();
			System.out.println("The longest line: " + max);
			
			pw.println(max);
			pw.println(sum);
			pw.println(iam);
			pw.close();
		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		Task 3	
//      Просто для пропуску рядка		
		System.out.println(" ");
		
		Runnable run1 = new Second();
		Thread th1 = new Thread(run1);
		th1.start();
	}

}
