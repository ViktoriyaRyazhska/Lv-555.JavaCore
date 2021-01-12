import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
//		Task_3;
		System.out.println(checkDate("01.07.21"));
		System.out.println(checkDate("13.22.22"));
		
//		Task_2;		
		List<String> list1 = Arrays.asList("Good","luck","my","friend","and","goodbye");
		List<String> list2 = list1.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(list2);
		
//		Task_1;	(але тільки з малими буквами)
		System.out.println(encrypt("abcz", 3));
		System.out.println(decrypt("defc", 3));
		
		
		
		
	}
	
	public static String decrypt(String in, int y){
	    String s = "";
	    for(int i = 0; i < in.length(); i++){
	        char c = (char)(in.charAt(i) - y);
	        if (c < 'a')
	            s += (char)(in.charAt(i) + (26-y));
	        else
	            s += (char)(in.charAt(i) - y);
	    }
	    return s;
	}
	public static String encrypt(String in, int x) {
		String sps = "";
		for (int i = 0; i < in.length(); i++) {
			char c = (char)(in.charAt(i) + x);
			if (c > 'z') {
				sps += (char)(in.charAt(i) - (26 - x));
			} else {
				sps += (char)(in.charAt(i) + x); 
			}
		}
		return sps;
	}
	
	
	
	public static boolean checkDate(String data){
		SimpleDateFormat myFormat = new SimpleDateFormat("MM.dd.yy");
		myFormat.setLenient(false);
		try {
			myFormat.parse(data);
			return true;
		} catch(Exception e){
			return false;
		}
	}
	
	

}
