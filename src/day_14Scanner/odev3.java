package day_14Scanner;
import java.util.Scanner;
public class odev3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter a number between 0 to 9");
	int num = input.nextInt();	
	String convert=(num==9)?"nine"
			: (num==8)?"eight"
			: (num==7)?"seven"
			: (num==6)?"six"
			: (num==2)?"two"							
			: (num==1)?"one"
			: (num==0)?"zero"
			: "invalid number";				
											
		System.out.println("you have entered "+convert);									
											
											
											
											
}										
}
