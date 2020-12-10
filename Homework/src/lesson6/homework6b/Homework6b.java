package lesson6.homework6b;

public class Homework6b {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("001", "Ivanov" , "02040608", 1000),
                new SalariedEmployee("002", "Petrov","021240608", 2000),
                new ContractEmployee("003", "Sidorov", "02040689", 20, 180),
                new ContractEmployee("004", "Volkov","36040608", 25, 175),
        };

        arrangeSalaryDescendinng(employees);
        printArray(employees);
    }

    public static void arrangeSalaryDescendinng(Employee[] employees){
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    Employee tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j]= tmp;
                }
            }
        }
    }

    public static void printArray(Employee[] employees){
        for (Employee e: employees){
            System.out.println(e);
        }
    }
}
