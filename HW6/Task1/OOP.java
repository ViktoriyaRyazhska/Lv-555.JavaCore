
public class OOP {

	public static void main(String[] args) {
		Bird[] B = new Bird[4];
		B[0] = new Eagle(3, "�");
		B[1] = new Swallow(4, "�");
		B[2] = new Penguin(2, "�");
		B[3] = new Chicken(1, "�");
		
		for (int i = 0; i < B.length; i++) {
			B[i].fly();
		}
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}
		
	
}
