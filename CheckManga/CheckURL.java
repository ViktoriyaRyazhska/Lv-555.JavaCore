import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CheckURL {
	public static String checkURL(String s) throws IOException {
		URL url = new URL(s);
		BufferedReader reader = new BufferedReader(new 
		InputStreamReader(url.openStream()));
		String line;
		StringBuilder sb=new StringBuilder();
		while ((line = reader.readLine()) != null) {
		sb.append(line+"\n");
		}
		reader.close();
		int start = sb.indexOf("<h4><a href=\"")+13;
		int end = sb.indexOf("\" title=\"\" class=\"\">",start);
		String s2 = sb.substring(start + sb.substring(start, end).lastIndexOf("/") + 1, end);
		return s2;
	}
}