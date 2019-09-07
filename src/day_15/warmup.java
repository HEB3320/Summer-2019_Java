package day_15;

public class warmup {
public static void main(String[] args) {
	
	  /*
	 write a java program that can convert numbers between 0 ~ 9
	  to words, if the number is greater than 9 or less than zero,
	   out put should be "Invalid".
	     */
	    
	   
	        int num =9;
	        String result="";
	        if(num >=0 && num <= 9) {
	            
	            if(num == 9) 
	                    result="nine";
	            else if(num ==8)
	                    result ="eight";
	            else if(num == 7)
	                    result ="seven";
	            else if(num == 6)
	                    result = "six";
	            else if(num == 5)
	                    result = "five";
	            else if(num == 4)
	                    result = "four";
	            else if(num == 3)
	                    result = "three";
	            else if(num == 2 )
	                    result = "two";
	            else if(num == 1)
	                    result = "one";
	            else 
	                result = "Zero";      
	        } else {
	            result = "Invalid";	
	        }
	System.out.println(result);
	
	
	
	
	
	
	
	        
	
}
}
