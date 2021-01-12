public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Raff");
    }

    @Override
    public void feed() {
        System.out.println("Eating bone");
    }
}
