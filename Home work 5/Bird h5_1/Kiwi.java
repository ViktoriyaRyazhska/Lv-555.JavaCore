public class Kiwi extends notFlyingBird {
    protected Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I'm a kiwi and I can't fly");
    }
}
