public class Task1 {
    public static void main(String[] args) {
        String str = "IT";
        String str2 = "IT Academy";

        System.out.println(check(str,str2));
    }
        public static Boolean check (String str,String str2){
            return str2.contains(str);
        }
    }

