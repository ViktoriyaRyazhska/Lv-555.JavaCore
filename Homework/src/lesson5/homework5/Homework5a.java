package lesson5.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework5a {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Months [] months = new Months[12];
        months[0] = new Months(1, 31, "January");
        months[1] = new Months(2, 28, "February");
        months[2] = new Months(3, 31, "March");
        months[3] = new Months(4, 30, "April");
        months[4] = new Months(5, 31, "May");
        months[5] = new Months(6, 30, "June");
        months[6] = new Months(7, 31, "July");
        months[7] = new Months(8, 31, "August");
        months[8] = new Months(9, 30, "September");
        months[9] = new Months(10, 31, "October");
        months[10] = new Months(11, 30, "November");
        months[11] = new Months(12, 31, "December");

        checkDaysInMonth(reader, months);
   }

   public static void checkDaysInMonth(BufferedReader reader, Months[] months) throws IOException {
       System.out.println("Enter the number of month from 1 to 12:>");
       int numberMonth = Integer.parseInt(reader.readLine());

       for (int i = 0; i < months.length; i++) {
           if(numberMonth == months[i].getMonthNumber()){
               System.out.println("Month is: " + months[i].getMonthName() +
                       ", the amount of days in this month is: " + months[i].getDaysInMonth());
           }
       }
       if(numberMonth == 2){
           System.out.println("If the year is a leap year, then there are 29 days in February");
       }
   }
}
