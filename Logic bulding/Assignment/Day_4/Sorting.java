// Question 12: Sort an Array in Ascending Order
import java.util.Scanner;
import java.util.Arrays;

class Sorting{
	
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	int size = 5;

	int order[] = new int[size];
	
	System.out.println("Enter 5 Integers");
	
	for(int i = 0; i < size; i++){
		
		order[i] = sc.nextInt();

	}
	//using using method
	Arrays.sort(order);
	System.out.println("Sorted Array");
	for(int itr : order){

	System.out.println(itr);
	}

	}

}