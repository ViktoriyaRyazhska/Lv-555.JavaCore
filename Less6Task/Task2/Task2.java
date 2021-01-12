public class Task2 {
    public static void main(String[] args) {
        Person[] persons = {new Student(), new Teacher(),new Student(), new Cleaner(), new Student()};
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                System.out.println("Salary: " + ((Staff) person).salary());
            }
        }
    }
}
