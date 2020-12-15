public class Eagle extends flyingBird {
    protected Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am an eagle and I fly");
    }
}
