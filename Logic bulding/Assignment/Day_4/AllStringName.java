//Question 8: Print All Names in a String Array using for each loop

import java.util.Scanner;

class AllStringName{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int size = 4;
	String names []= new String[size];
	
	System.out.println("Enter 4 names");
	
	
	
	for(int i = 0; i < size; i++){
		
		names[i] = sc.next();
	   
	}
	System.out.println("Print names");

	for(String num : names){

	System.out.println(num);
	}


	}

}
