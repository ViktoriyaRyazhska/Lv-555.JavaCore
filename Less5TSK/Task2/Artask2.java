import java.util.Scanner;

public class Artask2 {
    public static void main(String[] args) {


        Employee[] emp = {new Employee("Tom", 2, 2000),
                new Employee("Bob", 3, 4000),
                new Employee("Jack", 1, 6000),
                new Employee("Finn", 2, 3500),
                new Employee("Huck", 3, 8000)};
        Scanner scanner = new Scanner(System.in);
        thatDep(scanner, emp);
        Artask2.sortBySalary(emp);
    }
    public static void thatDep(Scanner scanner, Employee[] emp) {
        System.out.println("Department: ");
        int depNumber = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDepartmentNumber() == depNumber) {
                System.out.println(emp[i]);
            }
        }
        if(counter == 0){
            System.out.println("There is no employers from that department");
        }
    }
        public static void sortBySalary(Employee[] emp) {
            Employee tmp;
            for (int i = 0; i < emp.length - 1; i++) {
                for (int j = i + 1; j < emp.length; j++) {
                    if (emp[i].getSalary() < emp[j].getSalary()) {
                        tmp = emp[i];
                        emp[i]= emp[j];
                        emp[j] = tmp;
                    }
                }
            }
            for (int k = 0; k < emp.length; k++) {
                System.out.println(emp[k]);
            }
        }
    }


