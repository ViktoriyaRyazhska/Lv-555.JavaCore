import java.util.Arrays;

public class Menu {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Ira", "Bank", "A45C987", 7000),
                new SalariedEmployee("Anna", "Lawyer", "b789V45", 6000),
                new ContractEmployee("Ivan", "Freelance", "123321A", 20, 360),
                new ContractEmployee("Roman", "Игшдвук", "321123B", 18, 180)
        };
        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }

            }

        }
        for (Employee employee : employees) {
            employee.print();
        }
    }

}