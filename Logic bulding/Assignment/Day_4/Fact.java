//Question 3: Calculate the Factorial of a number
import java.util.Scanner;
class Fact{

	public static int factnumber(int n){
	int total = 1;
	for(int i = 1;i <= n;i++){
		total = total * i;

	}
	return total;

}

	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int num = sc.nextInt();

	int res = factnumber(num);
	System.out.println("Factorial of " +num+ " is " +res);
	

	}
}