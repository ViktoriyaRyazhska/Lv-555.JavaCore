public class notFlyingBird extends Bird {

    protected notFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
