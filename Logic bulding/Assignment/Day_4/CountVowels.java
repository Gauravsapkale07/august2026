//Question 25: Count Vowels in a String
import java.util.Scanner;
import java.util.*;
class CountVowels{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the string ");
	String str = sc.next();
	int vowel = 0;	
	for(int i = 0; i <= str.length() - 1; i++){

	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
		vowel++;	
		
	}
	

	} 
		System.out.println("The number of vowels in the string " +vowel);
	}

}	