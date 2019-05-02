package jdbcProjectPackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDaoJDBC {

	private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String userName = "user_db";
	private final String password = "Pass123";
	private final Driver driver = new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	public void connect() throws SQLException {
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,userName,password);
	
		} catch (SQLException e) {
			throw new SQLException(e.getMessage(),url);
			// TODO: handle exception
		}
		
		
	}
	public void dispose() {
		try {
			if (!rs.equals(null)) {
				if(!rs.isClosed())rs.close();
				
			}
			if (!ps.equals(null)) {
				if(!ps.isClosed())rs.close();
				
			}
			if (!conn.equals(null)) {
				if(!conn.isClosed())rs.close();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
}
}