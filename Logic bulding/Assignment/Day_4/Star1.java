/* Question 16: Write a program to print the following pattern.
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5 */
import java.util.Scanner;
class Star1{

	public static void printSimplePattern(int n){
	
	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= i; j++){

		if (j > 1) {
		    System.out.print("*");
		}
		System.out.print(j);

		/* if(j == 1){
			System.out.print(j);
			continue;
		}
		System.out.print("*" +j); */
		
		}
	System.out.println();
	
	}	

}

	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the Input");
	int input = sc.nextInt();

	printSimplePattern(input);

		
}

}