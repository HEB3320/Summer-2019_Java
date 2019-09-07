package day_09;

public class calisma2 {
public static void main(String[] args) {
	 /*
    60<= garde < 70 ==> D
    70 <= grade < 80 ==> C
    80 <= grade < 90 ==> B
    90 <= grade <= 100 ==>A
   50 <= grade < 60 ==> F
   40<= grade <50 ==> G
   30 <= grade < 40 ==> H
   20<=  grade < 30 ==> I
   10 <= grade < 20 ==> J
   0<=  grade <10  ==> K
   
   */	
	
 int grade = 50;
 
 if (grade>=0 && grade<=100) {
	
 if (grade >=90 && grade<=100) {
	System.out.println("A");
	}
	else if (grade >=80 && grade<90) {
		System.out.println("B");
	}
	else if (grade >=70 && grade<80) {
		System.out.println("C");
	}
	else if (grade >=60 && grade<70) {
		System.out.println("D");
	}
	else if (grade >=50 && grade<60) {
		System.out.println("F");
	}
	else if (grade >=40 && grade<50) {
		System.out.println("G");
	}
	else if (grade >=30 && grade<40) {
		System.out.println("H");
	}
	else if (grade >=20 && grade<30) {
		System.out.println("I");
	}
	else if (grade >=10 && grade<20) {
		System.out.println("J");
	}
	else {
 System.out.println("K");
	}
 }
 else {
	System.out.println("error 404"); 
 }
	
	
	
	
}
}
