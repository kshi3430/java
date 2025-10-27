package exam1020;

public class FulltimeEmployee extends Employee {
	
	private int annualSalary;
	
	public FulltimeEmployee(String name, String employeeId, int annualSalary) {
		super(name, employeeId);
		this.annualSalary = annualSalary;
	}
	
	public int getAnnualSalary() {
		return annualSalary;
	}
	
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	@Override
	public int calculatePay() {
		return annualSalary/12;
	}

}
