package lesson6.homework6a;

public class FlyingBird extends Bird{

    public FlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly() {
        return "Wow! I can fly!!!";
    }
}
