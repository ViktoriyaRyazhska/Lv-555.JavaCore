package HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String money = bf.readLine();
            Pattern p = Pattern.compile("\\${1}[0-9]+\\.*[0-9]{0,2}");
        Matcher m = p.matcher(money);
        while (m.find()) {
            System.out.print(money.substring(m.start(), m.end())+ " ");
        }

    }
}
