/*Question 17: Write a program to print Following Pattern 

	1
	1*3
	1*3*5
	1*3*5*7
	1*3*5*7*9
*/
import java.util.Scanner;
class Star6{


	public static void simpleStarPattern(int n){

	for(int i = 1; i <= n; i++){
		for(int j = 1; j <= i; j++){
		
		if(j>1)
			System.out.print("*");

		System.out.print(2*j-1);
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
