package payroll_project;

import java.sql.*;
public class ConnectionClass 
{
    Connection con;
    Statement stm;
    ConnectionClass()
    {
        try
        {
            
            con=DriverManager.getConnection("Jdbc:sqlite:C:/Users/HP/Documents/NetBeansProjects/EmployeeDatabasePayroll/src/payroll_project/SQLDatabase/employee.db");
            stm=con.createStatement();
            if(con.isClosed())
            {
                System.out.println("Connection is closed");
            }
            else
            {
                System.out.println("Connection is created");
            }    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new ConnectionClass();
    }
}
