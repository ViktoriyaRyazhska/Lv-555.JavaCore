import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick country");
        String country = scanner.nextLine();
        String s = country.toLowerCase();
        Continent continent;
        switch (s) {
            case ("ukraine"):
            case ("italy"):
            case ("spain"):
            case ("netherlands"):
                continent = Continent.EUROPE;
                System.out.println(continent);
                break;
            case ("asia"):
                continent = Continent.ASIA;
                System.out.println(continent);
                break;
            case ("northamerica"):
                continent = Continent.NORTHAMERICA;
                System.out.println(continent);
                break;
            case ("southamerica"):
                continent = Continent.SOUTHAMERICA;
                System.out.println(continent);
                break;
            case ("antarctica"):
                continent = Continent.ANTRACTICA;
                System.out.println(continent);
                break;
            case ("africa"):
                continent = Continent.AFRICA;
                System.out.println(continent);
                break;
            case ("australia"):
                continent = Continent.AUSTRALIA;
                System.out.println(continent);
                break;
            default:
                System.out.println("Not mutch");
        }
    }
}


