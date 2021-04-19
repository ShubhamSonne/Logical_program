package Logical_progm;

public class String_Palindrome {
	public static void main(String[] args) {
		String org="abcba1";
		String rev="";
		 
		for (int i = org.length()-1; i>=0; i--) {
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Orginal string value: " + org);
		
		System.out.println("reverse string value: " + rev);
		
		if (org.equals(rev)) {
			System.out.println("Given string is palindrome");
			
		}else {
			System.out.println("Given string is not palindrome");
		}
		
		
		
		
	}

}
