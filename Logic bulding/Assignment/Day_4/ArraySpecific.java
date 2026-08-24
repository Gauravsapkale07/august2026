// Question 13: Check if an Array Contains a Specific Element
import java.util.Scanner;
import java.util.Arrays;

class ArraySpecific{

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	int size = 5;
	Integer arr[] = new Integer[size];

	System.out.println("Enter 5 integers");
	
	for(int i = 0; i < size; i++){

		arr[i] = sc.nextInt();
	}

	System.out.println("Enter number to search ");
	int num = sc.nextInt();

	boolean b = Arrays.asList(arr).contains(num);
	
	if(b)
		System.out.println("Found");
	else
		System.out.println("not found");
	}

}