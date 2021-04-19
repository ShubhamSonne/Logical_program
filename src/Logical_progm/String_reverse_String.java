package Logical_progm;
public class String_reverse_String{
public static void main (String []args) {
	
	String a="shubham";
	String b="";
	
	for (int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
		
	}
	System.out.print(b);
	
}
}
