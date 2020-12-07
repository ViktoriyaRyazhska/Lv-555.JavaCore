package firstPac;

import java.util.Arrays;
import java.util.Scanner;

public class CW05_2 {
	
public static void main(String[] args) {
	
	//create array
	Employee[] emp = new Employee[5];
	emp[0] = new Employee ("John   ", 1, 2200);
	emp[1] = new Employee ("Mike   ", 2, 2100);
	emp[2] = new Employee ("Stephan", 3, 3000);
	emp[3] = new Employee ("Elsa   ", 2, 2000);
	emp[4] = new Employee ("Anna   ", 3, 3500);
			
	//3 tasks
	printEmp(emp);
	printDepEmp(emp);
	sortEmp(emp);
	}
	
	//print employee array
	static void printEmp(Employee[]emp) {
		for (int i = 0; i < emp.length;i++) {
			System.out.println(emp[i]);}
		}

	//print dep.employee
	static void printDepEmp(Employee[]emp){
		System.out.println();
		System.out.println("Enter department: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < emp.length;i++) {
			if (emp[i].dep == x) {
		System.out.println(emp[i]);
			}
		}
	}
	
	//sorting employee by salary
	static void sortEmp(Employee[]emp) {
		System.out.println();
		System.out.println("Sorting employee...");
		int tmp;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].salary < emp[j].salary) {
				tmp = emp[i].salary;
				emp[i].salary = emp[j].salary;
				emp[j].salary = tmp;
				}
			}
		}
	for (int i = 0; i < emp.length;i++) {
			System.out.println(emp[i]);}
	}
}


class Employee{
	Employee (String name, int dep, int salary){
		this.name = name;
		this.dep = dep;
		this.salary = salary;}
	
	String name;
	int dep;
	int salary;
	
	@Override
	public String toString() {
		return name + " dep: " + dep + ", salary: $" + salary;
	}
}