package firstPac;

public class HW06_1Birds {

	public static void main(String[] args) {
		Bird[] birds = {
					new Eagle(true, 2),
					new Swallow(true, 3),
					new Penguin(false, 1),
					new Chicken(false, 5),
        };

        for(Bird b: birds){
            b.fly();
        }
	}
}


abstract class Bird {
    private boolean feathers;
    private int layEggs;
    
    public Bird(boolean feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;    }

public abstract void fly();
}

class FlyingBird extends Bird {
	public FlyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);
    }
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}

class NonflyingBird extends Bird {
	public NonflyingBird(boolean feathers, int layEggs) {
        super(feathers, layEggs);    }
	
    public void fly() {
        System.out.println("I belive i can fly! OOOPS!!!");
    }
}

class Eagle extends FlyingBird {
	public Eagle(boolean feathers, int layEggs) {
    super(feathers, layEggs);    }}

class Swallow extends FlyingBird{
	public Swallow(boolean feathers, int layEggs) {
        super(feathers, layEggs);    }
}

class Penguin extends NonflyingBird {
	public Penguin(boolean feathers, int layEggs) {
        super(feathers, layEggs);    }
}

class Chicken extends NonflyingBird {
    public Chicken(boolean feathers, int layEggs) {
        super(feathers, layEggs);    }
}