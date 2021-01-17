import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriteSettings {
	public static void writeSettings() {
		String[][] results = ReadSettings.readSettings();
		String fileName = "settings.txt";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
			for (int i = 0; i < results.length; i++) {
				bw.write(results[i][0]+"	"+results[i][1]+"	"+CheckURL.checkURL(results[i][1])+"	\n");
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}