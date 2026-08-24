//Question 14: Find the Index of an Element in an Array

import java.util.*;

class ElementsArray{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	int arr[] = new int[5];

	System.out.println("Enter 5 integers ");
	for(int i = 0; i < 5; i++){

		arr[i] = sc.nextInt();
	}


	System.out.println("Enter the number to search ");
	int key = sc.nextInt();

	int index = Arrays.binarySearch(arr, key);
	if(index >= 0)
		System.out.println("The number "+key+" Found at index "+ index);
	else
		System.out.println("Not Found");

	}

}