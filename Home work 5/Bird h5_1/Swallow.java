public class Swallow extends  flyingBird {
    protected Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am an swallow and I fly");
    }
}
