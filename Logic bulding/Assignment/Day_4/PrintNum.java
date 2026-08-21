//Question 1: Print Numbers from 1 to N
import java.util.Scanner;
class PrintNum{
	
	public static void printNumbers(int n){
	
	for(int i = 1;i <= n;i++){
	System.out.println(i);
	
	}
}
	public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();

	printNumbers(num);

	
}

}