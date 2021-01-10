public class Homework2 {
    public static void main(String[] args) {
        String s = "I'am Tom";
//        String z = s.replace()
        System.out.println(encrypt(s, 3));
        System.out.println(decrypt(encrypt(s,3),3));

    }

    public static String encrypt(String s, int x) {
        char[] z = s.toCharArray();
        for (int i = 0; i < z.length; i++) {
            z[i] = (char) (z[i] + x);
        }
        return new String(z);
    }

    public static String decrypt(String s , int x) {
        char[] z = s.toCharArray();
        for (int i = 0; i < z.length; i++) {
            z[i] = (char) (z[i] - x);
        }
        return new String(z);
    }
}
