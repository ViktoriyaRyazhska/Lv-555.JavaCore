import java.io.IOException;
public class Less8 {

	public static void main(String[] args) {
		int res;
		try {
		res = squareRectangle(0, 4);
		System.out.println(res);
		} catch (Exception e) {
			System.out.println("a or b <= 0");
		}
		System.out.println();
		
		try {
		Plant[] plant = { new Plant("Rose", "red", 10),
				new Plant("tulip", "white", 5),
				new Plant("Marigold", "blue", 8),
				new Plant("Rose", "blue", 10),
				new Plant("tulip", "white", 7),};
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
	}
	//Methods
	public static int squareRectangle (int a, int b) throws Exception{
		if (a <= 0 || b <= 0) {
			throw new Exception();
		}
		return a * b;
	}
}
