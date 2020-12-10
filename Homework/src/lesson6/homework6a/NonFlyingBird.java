package lesson6.homework6a;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Oops! I can't fly.";
    }
}
