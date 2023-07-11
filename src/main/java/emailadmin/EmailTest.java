package emailadmin;

import java.util.Scanner;

public class EmailTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name : ");
		String fname=sc.next();
		System.out.println("Enter last name:");
		String lname=sc.next();
		
		Email e1 = new Email(fname,lname);
		e1.getInfo();
	}

}
