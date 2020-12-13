public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";
    @Override
    public int salary() {
    return 100;
    }

    @Override
    public void print() {
        System.out.println("I'm a Cleaner");
    }
}
