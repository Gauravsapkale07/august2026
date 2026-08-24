//Question 19: Write a program to print the following pattern:
/*	1
	22
	333
	4444
	55555
*/

import java.util.Scanner;

class Star4{


	public static void simpleStarPattern(int n){
		
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= i; j++){
		System.out.print(i);
	
		}
	System.out.println();
	
	}
}

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();

	simpleStarPattern(num);

}

}