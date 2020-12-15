public class Penguin extends notFlyingBird {
    protected Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I'm a penguin and I can't fly");
    }
}
