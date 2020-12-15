public class Chicken extends NonFlyingBird {//Куры летают
	private boolean layEggs = true,feathers = true;

	@Override
	public String toString() {
		return "Chicken [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}