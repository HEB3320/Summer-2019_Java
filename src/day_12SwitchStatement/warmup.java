package day_12SwitchStatement;

public class warmup {
public static void main(String[] args) {
	
	int n1=0;
	int n2=0;
	int n3=0;
	
	if (n1==n2 && n1!=n3) {
		System.out.println("n1 and n2 are equal");
		}
	else if (n1==n3 && n1!=n2) {
		System.out.println("n1 and n3 are equal");
	}
	else if (n2==n3 && n2!=n1) {
		System.out.println("n3 and n2 are equal");
	}
	else if (n2==n3 && n2==n1) {
		System.out.println("n1 and n2 and n3 are equal");
	}
	else {
		System.out.println("they are not equal each other");
	}
	
	
	
	
	
	
	
	
}
}
