
public class Less6 {

	public static void main(String[] args) {
		Animal[] A = new Animal[4];
		A[0] = new Dog();
		A[1] = new Dog();
		A[2] = new Cat();
		A[3] = new Cat();
		
		for (int i = 0; i < A.length; i++) {
			A[i].feed();
			A[i].voice();
		}
		Person[] P = new Person[6];
		P[0] = new Student();
		P[1] = new Student();
		P[2] = new Teacher();
		P[3] = new Teacher();
		P[4] = new Cleaner();
		P[5] = new Cleaner();
		
		for (int i = 0; i < P.length; i++) {
			P[i].print();
		}


	}

}
