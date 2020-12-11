public class NonFlyingBird extends Bird{
    public NonFlyingBird(String feathers, int layEGGS) {
        super(feathers, layEGGS);
    }

    @Override
    public boolean fly() {
        return false;
    }
}
