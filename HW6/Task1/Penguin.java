
public class Penguin extends NonFlyingBird {

	public Penguin() {}

	@Override
	public void fly() {
		System.out.println("ϳ���� �� ���.");
	}

	public Penguin(int layEggs, String feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Penguin [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}
