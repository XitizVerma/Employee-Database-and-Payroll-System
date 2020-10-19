package EmployeeDatabase;
import java.util.Scanner;
public class EmployementInformation 
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		long id = scr.nextLong();
		System.out.println("Enter the Employee Type");
		String employeetype = scr.nextLine();
		System.out.println("Enter the designation/role");
		String role = scr.nextLine();
		System.out.println("Enter the Buisness Office Location");
		String location = scr.nextLine();
		System.out.println("Enter the Shift");
		String shift = scr.nextLine();
		System.out.println("Enter the cost rate per day");
		float rate = scr.nextFloat();
		System.out.println("Enter overtime amt if any");
		float overtime = scr.nextFloat();
		
	}

}
