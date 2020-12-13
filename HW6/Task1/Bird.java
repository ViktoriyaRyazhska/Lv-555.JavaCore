
public abstract class Bird {
	public int layEggs;
	public String feathers;
	
	public abstract void fly();

	public Bird() {}
	
	public Bird(int layEggs, String feathers) {
		this.layEggs = layEggs;
		this.feathers = feathers;
	}
	
}
