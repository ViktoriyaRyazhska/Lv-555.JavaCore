public class Student extends Person{
    final private String TYPE_PERSON = "Student";

    @Override
    public String print() {
        return " says: I am a " + TYPE_PERSON;
    }

    public Student(String name) {
        super(name);
    }



}
