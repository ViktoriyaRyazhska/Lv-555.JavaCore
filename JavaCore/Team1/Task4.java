import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private String text;
    Pattern loudLetters = Pattern.compile("[aeyuioj]+");
    public Task3(){

    }
    public int findLoudLetters(Scanner scanner){
        this.text = scanner.nextLine();
        int count = 0;
        Matcher matcher = loudLetters.matcher(text);
        while(matcher.find()){
            count++;
        }
        return count;
    }
}
