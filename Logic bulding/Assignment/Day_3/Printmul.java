import java.util.Scanner;
class Printmul{

	public static void printMultiplicationTable(int n){
	
	for(int i = 1;i<=10;i++){
	
		System.out.println(n + " X " + i + " = "+n*i);
	}

	}

	
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number");
	int num = sc.nextInt();

	printMultiplicationTable(num);	
	
	}

}