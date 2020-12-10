package lesson6.classwork6b;

public class Teacher extends Staff{

    final String TYPE_PERSON = "Teacher";

    @Override
    public int salary() {
        System.out.println("My salary is 200$");
        return 200;
    }

    @Override
    public void print() {
        System.out.println("I'm a " + TYPE_PERSON);
    }

        public Teacher(String name) {
            super(name);
            System.out.println("Person type is " + TYPE_PERSON);
    }

}
