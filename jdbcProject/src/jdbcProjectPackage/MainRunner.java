package jdbcProjectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//1.register the driver for java
		
//		String url = "OrmSample	user_db@//localhost:1521/orcl";
		//establish connection to database 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "user_db";
		String password = "Pass123";
		Connection conn = DriverManager.getConnection(url,userName,password);
		
		if(conn.isValid(1)) {//checking if we have acvalid connection
			System.out.println("You have a valid connection");
		}else {
			System.out.println("Check your connection settings");
		};
		
		//3.Query the database
		
		Statement myStatement = conn.createStatement();
		ResultSet rs; //declare a resultset object
		
		//assign the result of the sql statement to the resultset
		
//		rs = myStatement.executeQuery("select* from JPAEMPLOYEENEW where employeeID = 1");
		rs = myStatement.executeQuery("select* from Users");
		rs.next();
		System.out.println(rs.getString(1)+ " "+ rs.getString(2)+ " "+rs.getString(3));
		

	}

}
