package lesson6.classwork6a;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Take a bone!");
    }
}
