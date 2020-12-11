public abstract class Bird {
    final public String feathers;
    final public int layEGGS;
    public String getFeathers() {
        return feathers;
    }
    public int getLayEGGS() {
        return layEGGS;
    }

    public Bird(String feathers, int layEGGS){
        this.feathers = feathers;
        this.layEGGS = layEGGS;
    }

    public abstract boolean fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEGGS=" + layEGGS +
                '}';
    }
}
