package EmployeeDatabase;
import java.sql.*;
public class SQL 
{
	public static void main(String args[])throws Exception
	{
		String url = "";
		String name = "XITIZ";
		String pass = "7759899137";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,name,pass);
	}

}
 