public class Chicken extends NonFlyingBird {//���� ������
	private boolean layEggs = true,feathers = true;

	@Override
	public String toString() {
		return "Chicken [layEggs=" + layEggs + ", feathers=" + feathers + "]";
	}
	
}