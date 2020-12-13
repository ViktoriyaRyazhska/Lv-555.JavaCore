
public class Eagle extends FlyingBird {

	public Eagle() {}
	

	@Override
	public void fly() {
		System.out.println("���� ���.");
	}
	public void print() {
		System.out.println("���� �� �����");
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
