//Question 11: Count Positive and Negative Numbers in an Array

import java.util.Scanner;

class CountPositive{


	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	int size = 6;
	int nums[] = new int[size];

	System.out.println("Enter the combination of negative and positive numbers ");
	for(int i = 0; i < size; i++){
	
		nums[i] = sc.nextInt(); 
	
	}
	int pos = 0;
	int neg = 0;
	for(int itr : nums){
		if(itr>0)
			pos++;
		else if(itr<0)
			neg++;
		else
			continue;	
	
	}
		System.out.println("Positive Numbers= " +pos);
		System.out.println("Negative Numbers= " +neg);

	}	

}