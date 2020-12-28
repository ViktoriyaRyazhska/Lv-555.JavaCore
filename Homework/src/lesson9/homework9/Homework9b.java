package lesson9.homework9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework9b {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        for (int i = 0; i < 10; i++) {
            try {
                number = readNumber(reader, number + 1, 100);
            } catch (NumberFormatException e) {
                System.out.println("You've entered not a number!");
            } catch (ArgumentOutOfRange e) {
                System.out.println(e.getMessage());
            } catch (InvalidRange e){
                System.out.println(e.getMessage());
                break;  //leave the for loop
            } catch (Exception e) {
                System.out.println("IOException");
            }
        }
    }

    public static int readNumber(BufferedReader reader, int start, int end) throws ArgumentOutOfRange, IOException, InvalidRange {
        if (start > end) {
            throw new InvalidRange("Invalid range [" + start + ".." + end + "]");
        }

        System.out.print("Please enter a number in range [" + start + ".." + end + "] :> ");

        int inputNumber = Integer.parseInt(reader.readLine());
        if (inputNumber < start || inputNumber > end) {
            throw new ArgumentOutOfRange("The number is NOT in the range [" + start + ".." + end + "]");
        }
        return inputNumber;
    }
}
