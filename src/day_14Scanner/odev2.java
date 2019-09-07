package day_14Scanner;
import java.util.Scanner;
public class odev2 {
public static void main(String[] args) {
	/*write a program that can convert numbers (between 0~9) to words.
	if the number is greater than 9, the out put should be "invalid number.
	            DO NOT USE IF STATEMENT
	ex 1: 
	input:
	enter a number between 0 to 9:
	1
	out put:
you have entered: one
	*/
	
	
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter a number between 0 to 9");
	int num = input.nextInt();
	switch (num) {
	case 0:
	System.out.println("you have entered: zero");
	break;	
	case 1:
		System.out.println("you have entered: one");
		break;	
	case 2:
		System.out.println("you have entered: two");
		break;	
	case 3:
		System.out.println("you have entered: three");
		break;
	case 4:
		System.out.println("you have entered: four");
		break;	
	case 5:
		System.out.println("you have entered:five");
		break;	
	case 6:
		System.out.println("you have entered: six");
		break;	
	case 7:
		System.out.println("you have entered: seven");
		break;	
	case 8:
		System.out.println("you have entered: eight");
		break;	
	case 9:
		System.out.println("you have entered: nine");
		break;	
		default:
			System.out.println("invalid");
		
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
