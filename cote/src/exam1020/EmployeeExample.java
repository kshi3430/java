package exam1020;

public class EmployeeExample {
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FulltimeEmployee("김자바","123456",4000000);
		emps[0] = new PartTimeEmployee("dl자바","456789",20000,160);
		
		for(int i=0; i<emps.length; i++) {
			String msg = emps[i].getName() + "," + emps[i].calculatePay();
			System.out.println(msg);
		}
		
	}

}
