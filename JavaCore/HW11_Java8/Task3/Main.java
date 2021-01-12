
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String date = "12.12.22";
        try {
            System.out.println(validateDate(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static boolean validateDate(String string) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yy");
        Date trueDate;
        trueDate = dateFormat.parse(string);
        return dateFormat.format(trueDate).equals(string);
    }
}



