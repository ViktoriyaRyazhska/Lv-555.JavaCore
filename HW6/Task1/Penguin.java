
public class Penguin extends NonFlyingBird {

	public Penguin() {}

	@Override
	public void fly() {
		System.out.println("œ≥Ì„‚≥Ì ÌÂ Î≥Ú‡∫.");
	}

	public Penguin(int layEggs, String feathers) {
		super(layEggs, feathers);
	}

	@Override
	public String toString() {
		return "Penguin [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}
