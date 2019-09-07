package day_14Scanner;
import java.util.Scanner;
public class odev {
public static void main(String[] args) {
	  
    /*
Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
User should be able to enter unit price and quantity.
Then the program will perform calculations and display amounts.
The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%.
See the example output as shown below:
Input:
Enter unit price: 25
Enter quantity: 110
Output:
Grand Total: $ 2750.0
Discount: 10%
Discount applied: $ 275.0
Total: $ 2475.0 
    */
	Scanner input = new Scanner (System.in);
	System.out.println ("Enter unit price");
	int unitPrice = input.nextInt();
	System.out.println("Enter quantity");
	int quantity = input.nextInt();
	System.out.println("Grant total: $ "+(unitPrice*quantity));
	
	boolean tt = true;
	
	if (tt) {
		if (quantity>=100 && quantity<=120) {
			System.out.println("Discount: 10%");
			System.out.println("Discount applied: $ "+(unitPrice*quantity)*0.1 );
			System.out.println("Total: $ " + (unitPrice*quantity-(unitPrice*quantity)*0.1));
		} else if (quantity >120) {
			System.out.println("Discount: 15%");
			System.out.println("Discount applied: $ "+(unitPrice*quantity)*0.15 );
			System.out.println("Total: $ " + (unitPrice*quantity-(unitPrice*quantity)*0.15));
		} else if (quantity>100 && quantity>0) {
			System.out.println("Discount: 0%");
			System.out.println("Discount applied: $ "+(unitPrice*quantity)*0.0 );
			System.out.println("Total: $ " + (unitPrice*quantity-(unitPrice*quantity)*0.0));
		} else {
			System.out.println("invalid");
			}
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
