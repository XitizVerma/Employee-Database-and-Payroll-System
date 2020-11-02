package EmployeeDatabase;
import java.util.Scanner;
public class EmployeeDetails 
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the name of Employee");
		String name = scr.nextLine();
		System.out.println("Enter the email");
		String email = scr.nextLine();
		System.out.println("Enter the contact number");
		long num = scr.nextLong();
		System.out.println("Enter the gender");
		String gender = scr.nextLine();
	}
}
