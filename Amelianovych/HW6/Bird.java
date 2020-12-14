package HW6;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public String getFeathers() {
        return feathers;
    }
    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
    public int getLayEggs() {
        return layEggs;
    }
    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public Bird (String feathers, int layEggs){
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }


    public abstract void fly();
}

