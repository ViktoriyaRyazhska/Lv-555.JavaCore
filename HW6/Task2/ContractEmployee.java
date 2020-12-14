
public class ContractEmployee extends Employee {
	private int federalTaxIdmember;

	private int fixedpayment = 7000;

	public ContractEmployee(String employeeld, int federalTaxIdmember) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedpayment() {
		return fixedpayment;
	}



	

	@Override
	public int calc() {
		return fixedpayment;
	}
	
	

}
