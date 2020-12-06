import java.util.Scanner;

public class Taska31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your error?");
        int num = scanner.nextInt();
        HTTPError error;
        switch (num) {
           case 400:
               error = HTTPError.BAD_REQUEST;
               System.out.println(error.getDisc());
               break;
           case 401:
               error = HTTPError.UNAUTHORIZED;
               System.out.println(error.getDisc());
               break;
           case 402:
               error = HTTPError.PAYMENT_REQUIRED;
               System.out.println(error.getDisc());
               break;
           case 403:
               error = HTTPError.FORBIDDEN;
               System.out.println(error.getDisc());
           case 404:
               error = HTTPError.NOT_FOUND;
               System.out.println(error.getDisc());
               break;
           default:
               System.out.println("UNKNOWN ERROR");
        }
    }
    }