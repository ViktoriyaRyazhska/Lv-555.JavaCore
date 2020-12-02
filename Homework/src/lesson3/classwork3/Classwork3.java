package lesson3.classwork3;

public class Classwork3 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ivanov", 10, 176);

        Employee e2 = new Employee("Petrov", 15);
        e2.setHours(180);

        Employee e3 = new Employee();
        e3.setName("Sidorov");
        e3.setRate(20);
        e3.setHours(190);

        System.out.println(Employee.getTotalSum());

    }
}