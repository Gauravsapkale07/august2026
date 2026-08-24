//Question 7: Find the Sum of All Elements in an Array

import java.util.Scanner;

class SumOfAllArray{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	
	int size = 5;
	
	int numbers [] = new int[size];

	System.out.println("Enter 5 integers");	
	for(int i = 0; i < size; i++){

		numbers[i] = sc.nextInt();
	}
	int sum = 0;
	
	for(int num : numbers){

	sum += num; 
	}
	
		System.out.println("Total Sum = " +sum);
		
	}

}