package regex;

import java.util.Scanner;
public class ValidateRegexStyle {

public static void main(String[] args) {
		/*
		 * First 2 uppercase letters
		 * and a - and
		 * Followed by 5 digits
		 * and a - and 1 uppercase letter
		 */
	Scanner sc = new Scanner(System.in); //scanner sc  for input
	
	System.out.println("Enter your Drvier's License Number: ");//license number
	String dL = sc.nextLine();
	
		if(isValidDL(dL)) {
			System.out.println(dL+" VALIDATED");
		}else {
			System.out.println(dL+" is INVALID");
		}
	
		System.out.println("Enter your Social Security Number: ");//ssn
		String ssn = sc.nextLine();
		
			if(isValidSSN(ssn)) {
				System.out.println(ssn+" VALIDATED");
			}else {
				System.out.println(ssn+" is INVALID");
			}
		
			System.out.println("Enter your Area/Zip Code: ");//area/zip code
			String zip = sc.nextLine();
			
				if(isValidAreaCode(zip)) {
					System.out.println(zip+" VALIDATED");
				}else {
					System.out.println(zip+" is INVALID");
				}
				
		System.out.println("Enter your License Plate: ");//license plate
		String lp = sc.nextLine();
				
					if(isValidLP(lp)) {
						System.out.println(lp+" VALIDATED");
					}else {
						System.out.println(lp+" is INVALID");
					}
				
			
	
	}
	
//Driver's License
	public static boolean isValidDL(String dL) {
		if(dL.matches("[A-Z]{2}-[0-9]{5}-[A-Z]{1}")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//SSN
	public static boolean isValidSSN(String ssn) {
	
		if (ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Area/Zip Code
	public static boolean isValidAreaCode(String areaCode) {
		if (areaCode.matches("[0-9]{5}")) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//License Plate
	public static boolean isValidLP(String lp) {
		
		if (lp.matches("[A-Z]{3}-[0-9]{4}")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
	}
	
	


//+1-9123456780
//"\\+1-[0-9]{10}" when using meta characters make sure you use \\behind the meta character to avoid any error



/*
 * Validate all the IDs you have
 * -SSN
 * -DLNo
 * -Area pin code
 * -Car License plate
 */


