package companyEmployees;

public class Employees {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
//constructor
	public Employees(long Id, String Name, String Address,
			long Phone) {
		this.employeeId= Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
		
	}
	
	void calculateSalary() {//method to calculate  salary
		double salary;
		salary = basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*hra/100);
		System.out.println("The salary is : $" + salary);
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = (10.0/100)*basicSalary;
		System.out.println("Transport Allowance is : $" + transportAllowance);
	}

}
