package EmployeeDatabase;
import java.util.Scanner;
public class BankDetails 
{
	public static void mmain(String args[])
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Bank Account Number");
		long bno = scr.nextLong();
		System.out.println("Enter the IFSC Code");
		String ifsc = scr.nextLine();
	}

}
