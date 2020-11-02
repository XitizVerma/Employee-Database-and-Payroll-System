package EmployeeDatabase;
import java.sql.*;
public class SQL 
{
	public static void main(String args[])throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/java";
		String name = "XITIZ";
		String pass = "12345678";
		String query = "SELECT * from java.employeedetails where Gender = 'M'";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String name1 = rs.getString("Ename");
		System.out.println(name1);
		st.close();
		con.close();
	}

}
 