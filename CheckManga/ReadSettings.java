import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadSettings {
	public static String[][] readSettings() {
		String[][] results = new String[4][3];
		int j = 0;
		String fileName = "settings.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
			String s = null;
			String[] lines;
			while ((s = br.readLine()) != null) {
				lines = s.split("	");
				for (int i = 0; i < lines.length; i++) {
					results[j][i] = lines[i];
				}
				j++;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return results;
	}
}