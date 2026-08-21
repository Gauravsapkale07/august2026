//Question 4: Print Even Numbers from 1 to N
//Sum of odd number
import java.util.Scanner;
class Sumofodd{
	
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();

	int sum = 0;
	for(int i = 1;i <=num;i++){

	if(i%2 == 0)
		continue;
	sum = sum+i;
	
	} 
	System.out.println("Sum of odd number "+sum);

     }
}