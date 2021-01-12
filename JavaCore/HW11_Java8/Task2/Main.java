public class Main {
    public static void main(String[] args) {
        String text = "abc";
        int key = 3;
        System.out.println(encrypt(text, key));
        System.out.println(decrypt(encrypt(text, key), key));
    }

    public static String encrypt(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        char letter;
        for (int i = 0; i < string.length(); i++) {
            letter = string.charAt(i);
            if (Character.isLetter(letter)) {
                letter = (char) (string.charAt(i) + n);
            }
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }

    public static String decrypt(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        char letter;
        for (int i = 0; i < string.length(); i++) {
            letter = (char) (string.charAt(i) - n);
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }
}

