public class Task2 {
    public static void execute(){
        System.out.println(isPalindrome("Bhиhb"));
    }
    public static boolean isPalindrome(String n){
        String reversedString = new StringBuffer(n).reverse().toString().toLowerCase();
        return n.toLowerCase().equals(reversedString);
    }
}
