package HW6;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I'm not flying");
    }

}
