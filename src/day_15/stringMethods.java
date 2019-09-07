package day_15;

public class stringMethods {
public static void main(String[] args) {

	
	String a="Batch 12 Javengers";
	char b= a.charAt(9);
	System.out.println(b);
	int c= a.length();
	System.out.println(c);
	
	int HighestIndex =a.length()-1;
	System.out.println(HighestIndex);
	
	String d ="Cybertek";
	
	d= d.concat(" Batch12 Javengers");
	System.out.println(d);
	
	d=d.toUpperCase();
	System.out.println(d);
	
	d= d.toLowerCase();
	System.out.println(d);
	
	
}
}
