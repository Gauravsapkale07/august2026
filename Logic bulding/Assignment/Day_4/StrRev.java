//Question 24: Reverse a String

import java.util.Scanner;
class StrRev{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String str = sc.next();

	System.out.println("Reversed String");
	
	String reversed = "";
	for(int i = str.length() - 1; i>=0; i--){
	
		reversed = reversed + str.charAt(i);

	}
	System.out.println(reversed);
	
	}

}