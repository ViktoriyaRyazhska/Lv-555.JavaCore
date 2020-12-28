import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork7_2 {
    public static void main(String[] args) {
       //Цей варіант працює
        String result = "I    am      learning     Java   Core".replaceAll(" {2,}", " ");
        System.out.println(result);


        // а так чомусь не працює не можу зрозуміти чому
        /*String result = "I    am      learning     Java   Core";
        result.replaceAll(" {2,}", " ");
        System.out.println(result);*/

    }

}
