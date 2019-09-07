package day_09;

public class multi_branchIF {
public static void main(String[] args) {
	
	int a =77, b=66, c= 77;

	if (a>b && a>c || a==b && a>c) {
	
	System.out.println(a+ " is the biggest");
	}
	else if (b>a && b>c || b==c && b>a) {
		System.out.println(b+ " is the biggest");
	}
	else if (c>b && c>a ||c==a && c>b) {
	System.out.println(c+ " is the biggest");
	}
	else {
		System.out.println(a+ " is the biggest");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	


}
