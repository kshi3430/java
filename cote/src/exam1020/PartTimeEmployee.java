package exam1020;

public class PartTimeEmployee extends Employee{
	
	private int hourRate;
	private int workHours;
	
	public PartTimeEmployee(String name, String employeeId, int hourRate, int workHours) {
		super(name, employeeId);
		this.hourRate = hourRate;
		this.workHours = workHours;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	@Override
	public int calculatePay() {
		return hourRate * workHours;
	}
}
