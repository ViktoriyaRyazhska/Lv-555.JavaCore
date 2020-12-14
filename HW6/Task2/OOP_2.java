
public class OOP_2 {

	public static void main(String[] args) {
		Employee[] E = new Employee[4];
		E[0] = new SalariedEmployee("Yaroslav", 1, 8, 100);
		E[1] = new ContractEmployee("Denys", 6);
		E[2] = new SalariedEmployee("Ivan", 2, 8, 150);
		E[3] = new ContractEmployee("Andriy", 10);
		
		for (int i = 0; i  < E.length - 1; i++) {
			for (int j = i + 1; j < E.length; j++) {
				if (E[i].calc() < E[j].calc()) {
					String tmp = E[i].employeeld;
					E[i].employeeld = E[j].employeeld;
					E[j].employeeld = tmp;
				}
			}
		}
		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

	}

}
