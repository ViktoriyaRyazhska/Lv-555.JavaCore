
public class Cleaner extends Staff {
	private String TYPE_PERSON = "ПРИБИРАЛЬНИК";
	
	public void print() {
		System.out.println("Я " + TYPE_PERSON);
		salary();
	}

	@Override
	public void salary() {
		System.out.println("Моя зарплата 5000 грн");
	}

}
