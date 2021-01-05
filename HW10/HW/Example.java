import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Example {
	public static void main(String... var)
	{
		ArrayList<String> list1 = new ArrayList();
		list1.add("dfxgsdf");
		list1.add("sdfg");
		list1.add("dsfg");
		list1.add("sdagfsa");
		list1.add("xcbxdfc");
		list1.add("sdf");
		list1.add("bxcvsd");
		ArrayList<String> list2 = list1;
		list2.removeIf(l -> l.length()<5);
		System.out.println(list2);
		System.out.println(encrypt("abc", 3));
		System.out.println(decrypt("def", 3));
		checkFormat("131.13.12");
	}
	public static String encrypt(String s, int n) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char)(chars[i] + n);
		}
		s = String.valueOf(chars);
		return s;
	}
	public static String decrypt(String s, int n) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char)(chars[i] - n);
		}
		s = String.valueOf(chars);
		return s;
	}
	public static void checkFormat(String s) {
		SimpleDateFormat form = new SimpleDateFormat("mm.dd.yy");
		Date d;
		try {
			d = form.parse(s);
			if (form.format(d).equals(s)) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		} catch (ParseException e) {
			System.out.println("Invalid");
		}
	}
}