package day_15;

import java.util.Scanner;

public class task3 {
public static void main(String[] args) {
	
	//enter first name then last name then dispays full name/ 
	
	
	Scanner input = new Scanner (System.in);
    System.out.println("Enter your name");
	String firstName = input.nextLine ();
	 System.out.println("Enter your last name");
	 String lastName = input.nextLine ();
	
	System.out.println("your full name is" + firstName+lastName);
	
	input.close ();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
