public class Month {
    public static int[] MonthDay(int days){
        int[] month = new int[days];
        int amount = 1;
        for (int i = 0; i < days; i++) {
            month[i] = amount;
            amount++;
        }
          return month;
    }
}
