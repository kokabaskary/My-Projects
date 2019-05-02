package companyEmployees;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Managers Data:");
		Managers manag1 = new Managers(126534, "Peter", "Chennai India", 237844, 65000);
		manag1.calculateSalary();
		manag1.calculateTransportAllowance();
		
		System.out.println("Trainees Data:");
		Trainee trainee1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		trainee1.calculateSalary();
		trainee1.calculateTransportAllowance();
	}

}
