//Question 9: Find the Largest Element in an Array

import java.util.Scanner;
import java.util.Arrays;

class LargestNum{


	public static void main(String [] args){


	Scanner sc = new Scanner(System.in);
	
	int size = 5;
	int num [] = new int[size];
	
	
	System.out.println("Enter 5 integers");
	
	for(int i = 0; i < size; i++){

		num[i] = sc.nextInt();
	}
	
/*	int max = 0;
	for(int largest : num){
	
	if(max<largest)
		max = largest; 
	}


*/

	int max = Arrays.stream(num).max().getAsInt();
	System.out.println("Largest Number = "+max);
	}


}