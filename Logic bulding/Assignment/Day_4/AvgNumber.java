// Question 10: Find the Average of Elements in an Array

import java.util.Scanner;

class AvgNumber{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	int size = 5;
	int nums[] = new int[size];

	System.out.println("Enter 5 numbers");

	for(int i = 0; i < size; i++){

		nums[i] = sc.nextInt();

	}
	int total = 0;
	for(int itr : nums){
		total = total + itr;

	}
	float avg = total/size;

	System.out.println("average = "+avg);
	


}


}