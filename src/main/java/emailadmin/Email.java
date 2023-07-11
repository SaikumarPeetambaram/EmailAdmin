package emailadmin;

import java.util.Scanner;

public class Email {
	
	
	//generate an email id with following syntax
	//first name,last name ,@department.company.com
	private String fname;
	private String lname;
	private String email;
	private String dept;
	private String password;
	
	public Scanner sc=new Scanner(System.in);
	
	public Email(String fname,String lname) {
		this.fname=fname;
		this.lname=lname; 
		
		System.out.println("New Employee : "+fname+"  "+lname);
		//call the method
		this.dept = this.setDept();
		System.out.println("Dept codes \n1 for sales\n2 for development\n0 for None");
		
		
		this.email = this.generateEmail();
	}

	private String generateEmail() {
		// TODO Auto-generated method stub
		return this.fname.toLowerCase()+"."+this.lname.toLowerCase()+"@"+ this.dept+".ncodeit.com";
	}

	private String setDept() {
		
		System.out.println("Dept codes \n1 for Sales\n2 for Development\n0 for None");

		System.out.println("Enter Dept code: ");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			return "Sales";

		case 2:

			return "Development";

		case 0:

			return "None";

		default:

			System.out.println("Invalid choice..");;
		}
		return null;
		
	}

	public void getInfo() {
		System.out.println(this.email);
	}
}
