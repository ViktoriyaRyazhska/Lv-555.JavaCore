
public class Car {
	String type;
	int year, eng;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", eng=" + eng + "]";
	}
	public Car(String type, int year, int eng) {
		this.type = type;
		this.year = year;
		this.eng = eng;
	}
	

}
