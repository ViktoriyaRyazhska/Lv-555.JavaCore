
public class Days {
    public enum DayOfTheWeek {
        Mon("Monday", "Понеділок", "Понедельник"),
        Tue("Tuesday", "Вівторок", "Вторник"),
        Wed("Wednesday", "Середа", "Среда"),
        Thur("Thursday", "Четвер", "Четверг"),
        Fri("Friday", "П'ятниця", "Пятница"),
        Sat("Saturday", "Субота", "Суббота"),
        Sun("Sunday", "Неділя", "Воскресенье");
        private final String en;
        private final String ua;
        private final String ru;

        DayOfTheWeek(String en, String ua, String ru) {
            this.en = en;
            this.ua = ua;
            this.ru = ru;
        }

        public String getDay(){
            return "EN: " + en + " UA: " + ua + " RU: " + ru;
        }
    }
}
