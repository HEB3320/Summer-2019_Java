package day_09;

public class Practice1 {
public static void main(String[] args) {
	
	/*
   status code: 

200, OK

201, Created

202, Accepted

301, Moved Permanently

303, See Other

304, Not Modified

307, Temporary Redirect

400, Bad Request

401, Unauthorized

403, Forbidden

404, Not Found

410, Gone

500, Internal Server Error

503, Service Unavailable
   
   */	
	
	
	int StatusCode=502;
	
	if (StatusCode>=200 && StatusCode<=507) {
		System.out.println("output=");
	
		if (StatusCode==200) {
		System.out.println("\n\t OK");
		}
		else if (StatusCode==201) {
			System.out.println("\n\t Created");
			}
		else if (StatusCode==202) {
			System.out.println("\n\t Accepted");
			}
		else if (StatusCode==301) {
			System.out.println("\n\t Moved Permenantly");
			}
		else if (StatusCode==303) {
			System.out.println("\n\t See Other");
			}
		else if (StatusCode==304) {
			System.out.println("\n\t Not Modified");
			}
		else if (StatusCode==307) {
			System.out.println("\n\t Temproray Redirect");
			}
		else if (StatusCode==400) {
			System.out.println("\n\t Best Request");
			}
		else if (StatusCode==401) {
			System.out.println("\n\t Unauthorized");
			}
		else if (StatusCode==403) {
			System.out.println("\n\t Forbidden");
			}
		else if (StatusCode==404) {
			System.out.println("\n\t Not Found");
			}
		else if (StatusCode==410) {
			System.out.println("\n\t Gone");
			}
		else if (StatusCode==500) {
			System.out.println("\n\t Internal Server Error");
			}
		else if (StatusCode==503) {
			System.out.println("\n\t Forbidden");
			}
		else if (StatusCode==507) {
			System.out.println("\n\t Service Unavailable");
			}
	
	}	
	
	else {
		System.out.println("");
		
	}
}
}
