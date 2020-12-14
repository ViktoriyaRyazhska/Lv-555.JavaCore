
public class SalariedEmployee extends Employee {
	private int socialSecNumb;
	private int hour;
	private int rate;
	
	public SalariedEmployee(String employeeld, int socialSecNumb, int hour, int rate) {
		super(employeeld);
		this.socialSecNumb = socialSecNumb;
		this.hour = hour;
		this.rate = rate;
	}

	public int getSocialSecNumb() {
		return socialSecNumb;
	}

	public void setSocialSecNumb(int socialSecNumb) {
		this.socialSecNumb = socialSecNumb;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	

	@Override
	public int calc() {
		return hour * rate;
	}

	
	
	

	
	
	
}
