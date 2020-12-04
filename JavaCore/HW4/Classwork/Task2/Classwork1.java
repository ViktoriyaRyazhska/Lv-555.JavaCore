import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classwork1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number day of the week: ");
        String input = br.readLine();
        switch (input){
            case "1":
                ForClasswork.DayOfTheWeek dayOfTheWeek = ForClasswork.DayOfTheWeek.Mon;
                System.out.println(dayOfTheWeek.getDay());
                break;
            case "2":
                ForClasswork.DayOfTheWeek dayOfTheWeek1 = ForClasswork.DayOfTheWeek.Tue;
                System.out.println(dayOfTheWeek1.getDay());
                break;
            case "3":
                ForClasswork.DayOfTheWeek dayOfTheWeek2 = ForClasswork.DayOfTheWeek.Wed;
                System.out.println(dayOfTheWeek2.getDay());
                break;
            case "4":
                ForClasswork.DayOfTheWeek dayOfTheWeek3 = ForClasswork.DayOfTheWeek.Thur;
                System.out.println(dayOfTheWeek3.getDay());
                break;
            case "5":
                ForClasswork.DayOfTheWeek dayOfTheWeek4 = ForClasswork.DayOfTheWeek.Fri;
                System.out.println(dayOfTheWeek4.getDay());
                break;
            case "6":
                ForClasswork.DayOfTheWeek dayOfTheWeek5 = ForClasswork.DayOfTheWeek.Sat;
                System.out.println(dayOfTheWeek5.getDay());
                break;
            case "7":
                ForClasswork.DayOfTheWeek dayOfTheWeek6 = ForClasswork.DayOfTheWeek.Sun;
                System.out.println(dayOfTheWeek6.getDay());
                break;
            default:
                System.out.println("There is no such day");
        }

    }
}
