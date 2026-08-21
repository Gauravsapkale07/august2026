import java.util.Scanner;

class Sum{
	public static int sumOfTwoNumbers(int a,int b){
	
		return a+b;
	}

	public static void main(String args[]){	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	int x = sc.nextInt();	

	System.out.println("Enter Second number");
	int y = sc.nextInt();
	
        int res = sumOfTwoNumbers(x,y);

	System.out.println("Addition = " +res);

	}
}
