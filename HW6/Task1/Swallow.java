
public class Swallow extends FlyingBird {

	public Swallow() {}

	@Override
	public void fly() {
		System.out.println("Ћавст≥вка л≥таЇ.");
	}

	public Swallow(int layEggs, String feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Swallow [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}
