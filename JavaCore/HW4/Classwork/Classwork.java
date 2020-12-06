import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Classwork {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Product product1 = new Product("Smartphone", 3000, 1500);
        Product product2 = new Product("Headphones", 500, 3000);
        Product product3 = new Product("Laptop", 2010, 100);
        Product product4 = new Product("Keyboard", 200, 5000);
        if((product1.getPrice() > product2.getPrice()) && (product1.getPrice() > product3.getPrice()) && (product1.getPrice() > product4.getPrice())){
            System.out.println(product1.getName() + " " + product1.getQuantity() + " is the most expensive");
        }else if((product2.getPrice() > product3.getPrice()) && (product2.getPrice() > product4.getPrice())){
            System.out.println(product2.getName() + " " + product2.getQuantity() + " is the most expensive");
        }else if(product3.getPrice() > product4.getPrice()){
            System.out.println(product3.getName() + " " + product3.getQuantity() + " is the most expensive");
        }else{
            System.out.println(product4.getName() + " " + product4.getQuantity() + " is the most expensive");
        }

        if((product1.getQuantity() > product2.getQuantity()) && (product1.getQuantity() > product3.getQuantity()) && (product1.getQuantity() > product4.getQuantity())){
            System.out.println(product1.getName() +  " has the biggest quantity");
        }else if((product2.getQuantity() > product3.getQuantity()) && (product2.getQuantity() > product4.getQuantity())){
            System.out.println(product2.getName() + " has the biggest quantity");
        }else if(product3.getQuantity() > product4.getQuantity()){
            System.out.println(product3.getName() + " has the biggest quantity");
        }else{
            System.out.println(product4.getName() + " has the biggest quantity");
        }
        System.out.print("Select option: day or country: ");
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