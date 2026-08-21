import java.util.Scanner;

class Positiveno{
	
	public static int askForPositiveNumber(){		

	Scanner sc = new Scanner(System.in);
	int num;
	do{
		System.out.println("Enter a positive number");
		num = sc.nextInt();
		
	}while(num <= 0);

return num;
}
	public static void main(String [] args){
	
        int p1 = askForPositiveNumber();	

	System.out.println("your positive no is " +p1);
}
}