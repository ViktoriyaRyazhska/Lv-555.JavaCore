
public class Product {
	private String name;
	private int price, qua;
	//Constructors
	public Product(String name, int price, int qua) {
		this.name = name;
		this.price = price;
		this.qua = qua;
	}
	//getters, setters
	public String getName() {
		return name;
	}
	//@Override
	//public String toString() {
		//return "Product [name=" + name + ", price=" + price + ", qua=" + qua + "]";
	//}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
	
	//public int exp() {
		
	}
	

