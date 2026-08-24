//Question 6: Print All Elements of an Array

import java.util.Scanner;

class AllArray{


	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size = sc.nextInt();  
	
	int numbers [] = new int[size];
	
	System.out.println("Enter the array elements");
	
	for(int i = 0; i < size; i++){

		numbers[i] = sc.nextInt();
	}
	
	
	//printing array elements
	System.out.println("printing NUmbers");
	for(int i = 0; i < numbers.length;i++){

		System.out.println(numbers[i] + " ");

	}

	}



}