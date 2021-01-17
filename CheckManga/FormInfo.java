import java.io.IOException;

public class FormInfo {
	public static String formInfo() throws IOException {
		String[][] results = ReadSettings.readSettings();
		String result = "";
		for (int i = 0; i < results.length; i++) {
			result+=results[i][0] + ": "+CheckURL.checkURL(results[i][1])+" was: "+results[i][2]+"\n";
		}
		return result;
	}
}