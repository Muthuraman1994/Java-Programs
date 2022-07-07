package OracleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class readExceldata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","Muthu@321");
		
		String S = "select * from Employees";
		
		PreparedStatement ps = connection.prepareStatement(S);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getString("first_Name"));
			System.out.println(rs.getString("last_name"));
			System.out.println(rs.getInt("department_id"));
			System.out.println("--------------------------");
		}
		
	}
}
