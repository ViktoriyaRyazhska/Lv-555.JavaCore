import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("number of HTTP Error (400, 502, 503, 504)");
        switch (i.nextInt()) {
            case 400:
                System.out.println(HTTPError.Bad_Request);
                break;
            case 502:
                System.out.println(HTTPError.Bad_Gateway);
                break;
            case 503:
                System.out.println(HTTPError.Service_Unavailable);
                break;
            case 504:
                System.out.println(HTTPError.Gateway_Timeout);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
