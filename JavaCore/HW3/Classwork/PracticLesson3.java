public class PracticLesson3 {
    public static void main(String[] args) {
        Employee number1 = new Employee("Andrew", 100, 12);
        Employee number2 = new Employee("Ostap", 80, 10);
        Employee number3 = new Employee("Masha", 90, 11);
        number1.getSalary();
        number1.changeRate();
        number1.getBonuses();
        number1.getTotalSum();
        System.out.println(number1);
    }
}
