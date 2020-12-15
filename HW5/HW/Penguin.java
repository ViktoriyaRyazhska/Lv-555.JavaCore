public class Penguin extends NonFlyingBird {
	private boolean layEggs = true,feathers = true;

	@Override
	public String toString() {
		return "Penguin [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}