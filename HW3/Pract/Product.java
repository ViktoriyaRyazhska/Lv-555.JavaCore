public class Product {
	private String name;
	private static String expname, quaname;
	private double cost;
	private static double expcost = 0.0;
	private int quantity;
	private static int expquantity;
	private static int quaquantity = 0;
	
	public Product(String name, double cost, int quantity) {
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		if (cost > expcost) {
			expcost = cost;
			expname = this.name;
			expquantity = this.quantity;
		}
		if (quantity > quaquantity) {
			quaname = this.name;
			quaquantity = this.quantity;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
		if (cost > expcost) {
			expcost = this.cost;
			expname = this.name;
			expquantity = this.quantity;
		}
		if (quantity > quaquantity) {
			quaname = this.name;
			quaquantity = this.quantity;
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public static void getExp() {
		System.out.println("Expensive item Name = " + expname + "; Quantity = " + expquantity);
	}
	public static void getQua() {
		System.out.println("Biggest quantity item Name = " + quaname);
	}
}