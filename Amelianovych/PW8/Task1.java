package PW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
   static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NegativeExeption {
        int a = 0;
        int b = 0;
        System.out.println("Please enter a");
            try {
                a = readNumber();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            catch (NegativeExeption e){  System.out.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());}

        System.out.println("Please enter b");
            try {
                b = readNumber();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            catch (NegativeExeption e){  System.out.println(e.getMessage());
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());}
        System.out.println(squareRectangle(a,b));
        }
    public static int squareRectangle (int a, int b){
            return a*b;
    }
    static int readNumber() throws NegativeExeption, IOException {
        int a = Integer.parseInt(bf.readLine());
        if (a < 0) {
            throw new NegativeExeption("It's can't be a negative number");
        }
        return a;
    }
}
