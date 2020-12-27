import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname, name and patronymic");
        String data = scanner.nextLine();
        System.out.println("Your surname and initials are : " + surnamesAndInitials(splitted(data)));
        System.out.println("Your name is: " + name(splitted(data)));
        System.out.println("Your data in order: name,  middle name and last name is : " + nameMiddleNameLastName(splitted(data)));
    }
    public static StringBuilder surnamesAndInitials(String [] string){
        StringBuilder str = new StringBuilder(string[0]);
        for (int i = 1; i < string.length; i++){

            str.append(" ").append(string[i].substring(0,1) + ".");
        }
            return str;
    }
    public static String[] splitted(String string){
        String[] splitted = string.split(" ");
        return splitted;
    }
    public static String name (String [] strings){
        return strings[1];
    }
    public static StringBuilder nameMiddleNameLastName (String[] string){
        StringBuilder str1 = new StringBuilder(string[1]);
        str1.append(" ").append(string[2]).append(" ").append(string[0]);
        return str1;
    }

}
