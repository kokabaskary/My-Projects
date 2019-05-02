package jdbcProjectPackage;

import java.sql.SQLException;
import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;



public interface EmployeeDAOI {
	
	enum SQL{
		GET_ALL_EMPLOYEE("SELECT * FROM JPAEMPLOYEENEW");
		GET_EMPLOYEE_BY_ID("SELECT * FROM JPAEMPLOYEENEW WHERE employeeID = ?");
		
		private final String query;
		private SQL(String s) {
			this.query = s;
		}
		public String getQuery() {
			return query;
		}
		
		List<EmployeeDAOI> 
		
	
		
	}
	


}
