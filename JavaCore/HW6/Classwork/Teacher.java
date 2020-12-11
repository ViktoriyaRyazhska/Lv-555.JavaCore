public class Teacher extends Staff{
    final private String TYPE_PERSON = "Teacher";

    @Override
    public String print() {
        return " says: I am a " + TYPE_PERSON;
    }

    public Teacher(String name) {
        super(name);
    }



    @Override
    public int salary() {
        return 1000;
    }
}
