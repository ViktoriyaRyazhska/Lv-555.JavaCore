import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println(validDate("12.02.01"));
        System.out.println(validDate("13.13.13"));
    }
    public static boolean validDate (String s){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy");
        format.setLenient(false);
        try {
            format.parse(s);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
