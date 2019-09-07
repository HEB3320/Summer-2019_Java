package day_09;

public class calisma1 {
public static void main(String[] args) {
	
	int grade = 90;
    
    if( grade >= 60 && grade <= 100) {
        System.out.println("you passed");
        
        if( grade >=90 && grade <= 100) {
            System.out.println("\twith a grade of A");
            
        } 
        else if(grade >=80 && grade < 90) {
            System.out.println("\twith a grade of B");
        }
        else if(grade >= 70 && grade < 80) {
            System.out.println("\twith a grade of C");
        }
        else {  // 60 <= grade < 70
            System.out.println("\t with a grade of D");
        }
        
    }
    else {  // either less than 60 or greater than 100
        
        if(grade < 60) {
            System.out.println("You failed with a grade of F");
        }
        else { // greater than 100
            System.out.println("Invalid score, error 404");
        }
        
    }
	
	
	
	
	
	
	
	
	
}
}
