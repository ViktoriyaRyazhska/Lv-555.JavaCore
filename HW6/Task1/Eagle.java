
public class Eagle extends FlyingBird {

	public Eagle() {}
	

	@Override
	public void fly() {
		System.out.println("ќрел л≥таЇ.");
	}
	public void print() {
		System.out.println("ќрел маЇ крила");
		fly();
	}


	public Eagle(int layEggs, String feathers) {
		super(layEggs, feathers);
	}


	@Override
	public String toString() {
		return "Eagle [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}
