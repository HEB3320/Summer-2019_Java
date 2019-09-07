package day_14Scanner;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
			System.out.println ("Enter a byte value");
	byte byteNum = input.nextByte();
	
	System.out.println("You have entered: "+byteNum);
	
	byte byteNum2 = input.nextByte();
	
	System.out.println("You have entered: "+byteNum2);
	
	System.out.println("Addition is: "+ (byteNum+byteNum2) );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
