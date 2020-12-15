public class flyingBird extends Bird {
    protected flyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
