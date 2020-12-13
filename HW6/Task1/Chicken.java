
public class Chicken extends NonFlyingBird {

	public Chicken() {}

	@Override
	public void fly() {
		System.out.println("����� �� ���.");
	}

	public Chicken(int layEggs, String feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Chicken [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}
