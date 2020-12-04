import java.util.Scanner;

public class ForClasswork {

    private String s;
    private String s1;
    private String s2;

    public enum DayOfTheWeek {
        Mon("Monday", "Понеділок", "Понедельник"),
        Tue("Tuesday", "Вівторок", "Вторник"),
        Wed("Wednesday", "Середа", "Среда"),
        Thur("Thursday", "Четвер", "Четверг"),
        Fri("Friday", "П'ятниця", "Пятница"),
        Sat("Saturday", "Субота", "Суббота"),
        Sun("Sunday", "Неділя", "Воскресенье");
        private final String s;
        private final String s1;
        private final String s2;

        DayOfTheWeek(String s, String s1, String s2) {
            this.s = s;
            this.s1 = s1;
            this.s2 = s2;
        }
        public String getDay(){
            return "EN: " + s + " UA: " + s1 + " RU: " + s2;
        }
    }
}