package emailapp;

import java.util.Scanner;
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String company;
	private int mailboxCapacity;
	private String alternateEmail;
	private String Email;
	private int defaultPasswordLength=10;
	// Constructor to receive the first and last name
	public Email(String firstName, String lastName, String company)
	{
		this.firstName = firstName;
		String ef = this.firstName.toLowerCase();
		this.lastName = lastName;
		String el = this.lastName.toLowerCase();
		this.company = company;
		this.department = setDepartment();
		String ed = this.department.toLowerCase();
		this.password = RandomPassword(defaultPasswordLength);
		String company1 = company.replaceAll("\\s","");
		company1 = company1.replaceAll("\\.", "");
		company1 = company1.toLowerCase();
		Email = ef.concat(".").concat(el).concat("@").concat(ed).concat(".").concat(company1).concat(".com"); 
	}
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("Enter the Department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\n");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice==1)
			return "Sales";
		else if(deptChoice==2)
			return "Development";
		else if(deptChoice==3)
			return "Accounting";
		else 
			return "";
		
	}
	//Generate a Random Password
	private String RandomPassword(int length)
	{
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890[];',./`";
		char[] pwd = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int) (Math.random() * passwordset.length());
			pwd[i] = passwordset.charAt(rand);
		}
		return new String(pwd);
	}
	//Set the mailbox capacity
	public void setMailbox(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	//Set an alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String passwrd)
	{
		this.password = passwrd;
	}
	public 	int getMailboxCapacity(){ return mailboxCapacity; };
	public String getAlternateEmail() { return alternateEmail; };
	public String getPassword(String pwd) { return pwd; };
	public String showInfo() { return "INFORMATION:\n" + firstName + " " + lastName + "\n" + department +  "\n" + company + "\n" + Email + "\n" + password + "\n" + mailboxCapacity + "\n" + alternateEmail;  };
}
