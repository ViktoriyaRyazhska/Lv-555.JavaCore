import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float: ");
        float a = sc.nextFloat();
        System.out.println("Enter second float: ");
        float a1 = sc.nextFloat();
        System.out.println("Enter third float: ");
        float a2 = sc.nextFloat();


        //code for float
        if((-5f <= a) && (a <= 5f)){
            System.out.println(a + " знаходиться в діапазоні [-5,5]");
        }
        else{
            System.out.println(a + " не знаходиться в діапазоні [-5,5]");
        }
        if((-5f <= a1) && (a1 <= 5f)){
            System.out.println(a1 + " знаходиться в діапазоні [-5,5]");
        }
        else{
            System.out.println(a1 + " не знаходиться в діапазоні [-5,5]");
        }
        if((-5f <= a2) && (a2 <= 5f)){
            System.out.println(a2 + " знаходиться в діапазоні [-5,5]");
        }
        else{
            System.out.println(a2 + " не знаходиться в діапазоні [-5,5]");
        }
        System.out.println("Enter first int: ");
        int b = sc.nextInt();
        System.out.println("Enter second int: ");
        int b1 = sc.nextInt();
        System.out.println("Enter third int: ");
        int b2 = sc.nextInt();
        //code for int
        //min without methods
        if((b<b1) && (b<b2)){
            System.out.println(b + " min");
        }else if (b1<b2){
            System.out.println(b1 + " min");
        }else{
            System.out.println(b2 + " min");
        }
        //max
        if((b>b1) && (b>b2)){
            System.out.println(b + " max");
        }else if (b1>b2){
            System.out.println(b1 + " max");
        }else{
            System.out.println(b2 + " max");
        }
        System.out.print("Enter code of https error: ");
        switch (sc.next()){
            case "401":
                System.out.println(Errors.HttpsErrors.Unauthorized);
                break;
            case "402":
                System.out.println(Errors.HttpsErrors.Payment_Required);
                break;
            case "403":
                System.out.println(Errors.HttpsErrors.Forbidden);
                break;
            case "404":
                System.out.println(Errors.HttpsErrors.Not_Found);
                break;
            case "405":
                System.out.println(Errors.HttpsErrors.Method_Not_Allowed);
                break;
            default:
                System.out.println("This prototype does not know this HTTP Error yet");
        }
    }
}
