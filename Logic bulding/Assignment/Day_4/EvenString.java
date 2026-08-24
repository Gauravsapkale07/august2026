//Question 4: Print Even Numbers from 1 to N.

import java.util.Scanner;

class EvenString{


	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size");
	int size = sc.nextInt();  // read size how much size you want
	
	int numbers [] = new int[size];
	
	System.out.println("Enter the array elements");
	
	for(int i = 0; i < size; i++){

		numbers[i] = sc.nextInt();
	}
	
	
	//printing array elements
	System.out.println("printing Even NUmbers");
	for(int i = 0; i < numbers.length;i++){
		if(numbers[i]%2==0)
		System.out.println(numbers[i] + " ");

	}

	}



}