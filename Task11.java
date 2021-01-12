import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public void execute() throws IOException {
        System.out.println("Please enter a credit card #");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String card = bf.readLine();
        Pattern p = Pattern.compile("^4[0-9]{13}|^4[0-9]{15}|^51[0-9]{15}|^55[0-9]{15}|^6011[0-9]{15}" +
                "|^65[0-9]{15}|^34[0-9]{14}|^37[0-9]{14}");
        Matcher m = p.matcher(card);

        while (m.find()) {
            System.out.print(card.substring(m.start(), m.end()) + " valid");
        }

    }
}
