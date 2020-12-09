package lesson5.homework5;

public class Months {
    private int monthNumber;
    private int daysInMonth;
    private String monthName;

    public Months(int monthNumber, int daysInMonth, String monthName) {
        this.monthNumber = monthNumber;
        this.daysInMonth = daysInMonth;
        this.monthName = monthName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public String getMonthName() {
        return monthName;
    }

}
