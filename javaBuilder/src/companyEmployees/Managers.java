package companyEmployees;

public class Managers extends Employees{

	public Managers(long Id, String Name, String Address, long Phone, double salary) {
		super(Id, Name, Address, Phone);
		this.basicSalary= salary;
		
	}
	
	
	void calculateTransportAllowance() {
		double transportAllowance = (15*basicSalary)/100;
		System.out.println("Transport Allowance for Managers is : $" + transportAllowance);
	}

}
