package PW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    String s = "IT";
//    String d = "IT Academy";
//    if (d.contains(s)) System.out.println(true);
//        System.out.println("Please enter your surname, name and patronymic");
//        String person = bf.readLine();
//        String [] pib = person.split(" ");
//        System.out.println(pib[0] +" "+ pib[1].charAt(0) +" "+ pib[2].charAt(0));
//        System.out.println(pib[1]);
//        System.out.println(pib[0]+" "+pib[1]+" "+pib[2]);
        String [] k = {"Andrew", "Kevin", "12334", "s"};
        Pattern p = Pattern.compile("[A-Za-z]{3,15}");
        for (int i = 0; i < k.length; i++) {
            Matcher m = p.matcher(k[i]);
        if (m.matches()) { System.out.println("Good name: "+k[i]); }
        else System.out.println(k[i] + " is not a good name");
    }
}
}

