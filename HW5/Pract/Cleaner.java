public class Cleaner extends Staff {
	final String TYPE_PERSON = "Cleaner";
	Cleaner(){
		System.out.println(TYPE_PERSON);
	}
	@Override
	void print() {
		System.out.println("I am a Cleaner");
	}
	@Override
	void salary() {
		System.out.println("100$");
	}
}