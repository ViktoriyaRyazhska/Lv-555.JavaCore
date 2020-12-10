package lesson6.homework6a;

public abstract class Bird {
    final public boolean feathers;
    final public int layEggs;

    public abstract String fly();

    public Bird(boolean feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "{" + this.getClass().getSimpleName()+
                " feathers=" + feathers +
                ", layEggs=" + layEggs +
                ", ability to fly=" + this.fly() +
                '}';
    }
}
