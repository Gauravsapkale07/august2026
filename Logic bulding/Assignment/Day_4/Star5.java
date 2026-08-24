//Question 20 : Write a Java program to print the following Pattern
/*	1
	12
	123
	1234
	12345
*/

import java.util.Scanner;

class Star5{

	public static void simpleStarPattern(int n){
	
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= i; j++){
		
		System.out.print(j);
		}
	System.out.println();

	}
		
	}

	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number:");
	int num = sc.nextInt();
	simpleStarPattern(num);
	
	}

}