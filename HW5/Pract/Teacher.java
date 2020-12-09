public class Teacher extends Staff {
	final String TYPE_PERSON = "Teacher";
	Teacher(){
		System.out.println(TYPE_PERSON);
	}
	@Override
	void print() {
		System.out.println("I am a Teacher");
	}
	@Override
	void salary() {
		System.out.println("50$");
	}
}