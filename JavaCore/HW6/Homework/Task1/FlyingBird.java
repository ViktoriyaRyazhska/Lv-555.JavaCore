public class FlyingBird extends Bird{
    public FlyingBird(String feathers, int layEGGS) {
        super(feathers, layEGGS);
    }

    @Override
    public boolean fly() {
        return true;
    }

}
