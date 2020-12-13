public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";
    @Override
    public int salary() {
    return 200;
    }

    @Override
    public void print() {
        System.out.println("I'm a Teacher");
    }
}
