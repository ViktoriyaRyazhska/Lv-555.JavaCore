import java.util.Scanner;

public class Task6 {
    private String text;

    public int wordsCount(Scanner scanner){
        this.text = scanner.nextLine();
        int count = text.split(" ").length;

        return count;
    }
}
