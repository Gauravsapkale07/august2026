//Question 7: Find the Sum of All Elements in an Array

import java.util.Scanner;

class SumOfOddString{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size = sc.nextInt(); 
	
	int numbers [] = new int[size];
	
	System.out.println("Enter the array elements");
	
	for(int i = 0; i < size; i++){

		numbers[i] = sc.nextInt();
	}
	
	
	for(int i = 0; i < numbers.length;i++){
		if(numbers[i]%2==0)
		System.out.println(numbers[i] + " ");

	}

	}



}