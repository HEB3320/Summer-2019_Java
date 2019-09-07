package day11;

public class review1 {
public static void main(String[] args) {
	
	
	int month2 = 6;
    int year = 2000;
    if(month2>0 && month2 <13) {  //  1~12
        
            if(month2 ==2 ) { // month2=2
                if(year%4 == 0) {
                    System.out.println("29 days");
                } 
                else {
                    System.out.println("28 days");
                }
            }
            
            else if( month2== 4 || month2==6 ) { // month2=4 or month2=6
                
                System.out.println("30 days");
                
            } else if ( month2==9 || month2==11) { // month2=9 or month2=11
                System.out.println("30 days");
                
            } else { //  month2 : 1,3,5,7,8,10,12
                System.out.println("31 days");
            }
    
    } else {
        
        System.out.println("Invalid Entry");
        
    }
        
   
    if(false) { // true
        System.out.println("hello");
    }
    else if (false) { // false
        System.out.println("Batch 12");
    }
    else {  // NEVER GETS EXECUTED
        System.out.println("Cybertek");
    } 
    
    if (true) {
    System.out.println("ggg");
    System.out.println("fff");
    System.out.println("bbb");
}

    if (true) {

	System.out.println("tt");
	
	
    }
	
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    double cost = in.nextDouble();
    
     System.out.println(num+ cost); 
    
    
    
}
	}


