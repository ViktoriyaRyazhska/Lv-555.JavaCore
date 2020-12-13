import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        Employee[] emps = {new SalariedEmployee("1", "Huck",30000, "3592736"),
                new ContractEmployee("2", "Tom","9795068", 100, 200),
                new SalariedEmployee("3", "Sawyer",25000, "3592725"),
                new ContractEmployee("4", "Finn","8651305", 150, 180)};
//        System.out.println(Arrays.asList(emps));
        sortByProductionYear(emps);
    }
    public static void sortByProductionYear(Employee[] emps) {
        for (int z = 0; z < emps.length - 1; z++) {
            for (int j = z + 1; j < emps.length; j++) {
                if (emps[z].calculatePay() < emps[j].calculatePay()) {
                    Employee tmp = emps[z];
                    emps[z] = emps[j];
                    emps[j] = tmp;
                }
            }
        }
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }
}