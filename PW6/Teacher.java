
public class Teacher extends Staff {
	private String 	TYPE_PERSON = "�������";
	
	public void print() {
		System.out.println("� " + TYPE_PERSON);
		salary();
	}
	@Override
	public void salary() {
		System.out.println("��� �������� 7000 ���");
		
	}
}
