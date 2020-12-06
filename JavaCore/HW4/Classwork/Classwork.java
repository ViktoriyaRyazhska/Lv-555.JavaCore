import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classwork {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter day or country:");
        String input = br.readLine();
        switch (input.toLowerCase()) {
            case "day":
                System.out.print("Enter the number day of the week: ");
                String inputDay = br.readLine();
                switch (inputDay) {
                    case "1":
                        Days.DayOfTheWeek dayOfTheWeek = Days.DayOfTheWeek.Mon;
                        System.out.println(dayOfTheWeek.getDay());
                        break;
                    case "2":
                        Days.DayOfTheWeek dayOfTheWeek1 = Days.DayOfTheWeek.Tue;
                        System.out.println(dayOfTheWeek1.getDay());
                        break;
                    case "3":
                        Days.DayOfTheWeek dayOfTheWeek2 = Days.DayOfTheWeek.Wed;
                        System.out.println(dayOfTheWeek2.getDay());
                        break;
                    case "4":
                        Days.DayOfTheWeek dayOfTheWeek3 = Days.DayOfTheWeek.Thur;
                        System.out.println(dayOfTheWeek3.getDay());
                        break;
                    case "5":
                        Days.DayOfTheWeek dayOfTheWeek4 = Days.DayOfTheWeek.Fri;
                        System.out.println(dayOfTheWeek4.getDay());
                        break;
                    case "6":
                        Days.DayOfTheWeek dayOfTheWeek5 = Days.DayOfTheWeek.Sat;
                        System.out.println(dayOfTheWeek5.getDay());
                        break;
                    case "7":
                        Days.DayOfTheWeek dayOfTheWeek6 = Days.DayOfTheWeek.Sun;
                        System.out.println(dayOfTheWeek6.getDay());
                        break;
                    default:
                        System.out.println("There is no such day");
                }
                break;
            case "country":
                System.out.print("Enter the country: ");
                String inputCountries = br.readLine();
                switch (inputCountries.toLowerCase()) {
                    case "ukraine":
                        System.out.println(Continent.CountryOfTheContinent.Europe);
                        break;
                    case "sudan":
                        System.out.println(Continent.CountryOfTheContinent.Africa);
                        break;
                    case "australia":
                        System.out.println(Continent.CountryOfTheContinent.Australia);
                        break;
                    case "brazil":
                        System.out.println(Continent.CountryOfTheContinent.SouthAmerica);
                        break;
                    case "canada":
                        System.out.println(Continent.CountryOfTheContinent.NorthAmerica);
                        break;
                    case "hercules dome":
                        System.out.println(Continent.CountryOfTheContinent.Antarctica);
                        break;
                    case "china":
                        System.out.println(Continent.CountryOfTheContinent.Asia);
                        break;
                    default:
                        System.out.println("This prototype does not know this country. Sorry(");
                }
                break;
            default:
                System.out.println("There is no such option");
        }
    }
}