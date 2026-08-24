/* Question 18: Write a program to print the following pattern:
11111
22222
33333
44444
55555 */

import java.util.Scanner;

class Star2{
	
	public static void simplePatternProgram(int n){

	for(int i = 1; i <= n; i++){
		for(int j =1; j <= n; j++){
		
		System.out.print(i);
		} 
	System.out.println();
	}

}
	
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Number");
	int num = sc.nextInt();

	
	simplePatternProgram(num);
}
	

}