
public class Teacher extends Staff {
	private String 	TYPE_PERSON = "ВЧИТЕЛЬ";
	
	public void print() {
		System.out.println("Я " + TYPE_PERSON);
		salary();
	}
	@Override
	public void salary() {
		System.out.println("Моя зарплата 7000 грн");
		
	}
}
