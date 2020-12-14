package firstPac;

public class CW06 {

	public static void main(String[] args) {
		
		// voice & feed animals
		Animal[] a = new Animal[4];
		a[0] = new Cat();
		a[1] = new Dog();
		a[2] = new Cat();
		a[3] = new Dog();

		for (int i = 0; i < a.length; i++) {
			a[i].voice();
			a[i].feed();
		}
		
		//school people
		Person[] p = new Person[6];
		p[0] = new Student("Mike");
		p[1] = new Student("Olga");
		p[2] = new Student("Anna");
		p[3] = new Teacher("Alex");
		p[4] = new Teacher("Stan");
		p[5] = new Cleaner("Mari");
		
		for (int i = 0; i < p.length; i++) {
			p[i].print();
			if (p[i] instanceof Staff) {
			((Staff) p[i]).salary();
			}
		}
	}
}


//ANIMALS
interface Animal{
	void voice();
	void feed();
}

class Cat implements Animal{
		public void voice() {
			System.out.println("Miau!!!");	}

		public void feed() {
			System.out.println("fish");	}
	}

class Dog implements Animal{
	public void voice() {
		System.out.println("Bark!!!");	}

	public void feed() {
		System.out.println("meet");	}
	}


// SCHOOL PEOPLE

interface Salary {
    void salary();
}

abstract class Person {
	public Person(String name) {
		this.name = name;}
	String name;
	abstract void print();}

abstract class Staff extends Person  implements Salary {
	public Staff(String name) {
		super(name);}
//	public abstract void salary();
	}

class Student extends Person {
	Student(String name) {
		super(name);}

	String TYPE_PERSON = "Student";
	void print() {
		System.out.println(name + ". I am a " + TYPE_PERSON);}
}

class Teacher extends Staff {
	Teacher(String name) {
		super(name);}
	String TYPE_PERSON = "Teacher";
	void print() {
		System.out.println(name + ". I am a " + TYPE_PERSON);}
	public void salary() {
		System.out.println("500$");}
}

class Cleaner extends Staff {
	 Cleaner(String name) {
		super(name);}
	String TYPE_PERSON = "Cleaner";
		void print() {
		System.out.println(name + ". I am a " + TYPE_PERSON);}
	public void salary() {
		System.out.println("300$");}
}

