package testing;

public class Employee {

    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getRate()
    {
        return rate;
    }
    public void setRate(int rate) {
        totalSum -= salary() + bonuses();
        this.rate = rate;
        totalSum += salary() + bonuses();
    }

    public int getHours(){
        return hours;
    }
    public void setHours(){
        totalSum -= salary() + bonuses();
        this.hours = hours;
        totalSum += salary() + bonuses();
    }

    public void setHours(int hours)
    {
        totalSum -= salary() + bonuses();
        this.hours = hours;
        totalSum += salary() + bonuses();
    }
    public Employee(){
        totalSum += salary() + bonuses();

    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);

        totalSum += salary()+bonuses();

    }

    public Employee(String name, int rate, int hours)
    {
        this.name = name;
        setRate(rate);
        setHours(hours);

        totalSum += salary() + bonuses();
    }


    int bonuses()
    {
        return salary() / 10;
    }

    int salary()
    {
        return rate * hours;
    }



    void changeRate(int newRate)
    {
        totalSum -= salary() + bonuses();

        setRate(newRate);

        totalSum += salary() + bonuses();
    }

    @Override
    public String toString()
    {
        String info = String.format("Name: %1$s, Rate: %2$s, Hours: %3$s", getName(), getRate(), getHours());
        return info;
    }

}