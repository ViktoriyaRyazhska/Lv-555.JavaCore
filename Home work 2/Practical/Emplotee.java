public class Emplotee {

    private static int totalSum = 0;
    private String name;
    private int rate;
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    public Emplotee() {
    }

    public Emplotee(String name, int rate) {
        totalSum += getSalary();
        this.name = name;
        this.rate = rate;
        totalSum += getSalary();
    }

    public Emplotee(String name, int rate, int hours) {
        totalSum += getSalary();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    @Override
    public String toString() {
        return "Emplotee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public int getSalary(){
        int salary = this.rate * this.hours;
        return salary;
    }
    public void  changeRate (int rate){
        this.rate = rate;
        getSalary();
    }
    public double getBonuses(){
        double bonuses =  getSalary() * 0.1;
        totalSum += bonuses;
        return bonuses;
    }
    public static int getTotalSum (){
        return totalSum;
    }
}
