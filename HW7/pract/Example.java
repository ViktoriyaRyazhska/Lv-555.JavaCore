public class Example {
	public static void main(String... var)
	{
		try {
			Plant[] plants = {	new Plant(12,"red","type1"),
					new Plant(325,"red","type1"),
					new Plant(123,"blue","type2"),
					new Plant(23,"gree1n","type3"),
					new Plant(1,"red","type4"),
			};
		} catch (ColorException | TypeException e) {
			System.out.println(e.getMessage());
		}
	}
}