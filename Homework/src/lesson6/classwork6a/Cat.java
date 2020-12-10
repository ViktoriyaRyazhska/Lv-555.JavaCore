package lesson6.classwork6a;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("Mew!");
    }

    @Override
    public void feed() {
        System.out.println("Take a fish!");
    }
}
