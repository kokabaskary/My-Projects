package fileHandler;

public class Employee {
	

	 private int eId;
	 private String eName;
	 private String eCity;
	 
	public Employee(int eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}
	
	  int geteId() {
		return eId;
	}
	  
	 void seteId(int eId) {
		this.eId = eId;
	}
	 String geteName() {
		return eName;
	}
	 
	 void seteName(String eName) {
		this.eName = eName;
	}
	
	 String geteCity() {
		return eCity;
	}
	 
	 void seteCity(String eCity) {
		this.eCity = eCity;
	}
	 
}
