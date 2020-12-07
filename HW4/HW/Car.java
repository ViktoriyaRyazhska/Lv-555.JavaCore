public class Car {
	private String type;
	private int year_of_production, engine_capacity;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear_of_production() {
		return year_of_production;
	}
	public void setYear_of_production(int year_of_production) {
		this.year_of_production = year_of_production;
	}
	public int getEngine_capacity() {
		return engine_capacity;
	}
	public void setEngine_capacity(int engine_capacity) {
		this.engine_capacity = engine_capacity;
	}
	public Car(String type, int year_of_production, int engine_capacity) {
		this.type = type;
		this.year_of_production = year_of_production;
		this.engine_capacity = engine_capacity;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", year_of_production=" + year_of_production + ", engine_capacity="
				+ engine_capacity + "]";
	}
}