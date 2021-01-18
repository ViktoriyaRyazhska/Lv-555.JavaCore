import java.io.IOException;

public class FormInfo {
	public static String formInfo() throws IOException {
		String[][] results = ReadSettings.readSettings();
		String result = "<html>";
		String currentChapter = "";
		for (int i = 0; i < results.length; i++) {
			currentChapter = CheckURL.checkURL(results[i][1]);
			if (!currentChapter.equals(results[i][2]))
				currentChapter="<font color='red'>"+currentChapter+"</font>";
			result+=results[i][0] + ": "+currentChapter+" was: "+results[i][2]+"<br>";
		}
		result+="</html>";
		return result;
	}
}