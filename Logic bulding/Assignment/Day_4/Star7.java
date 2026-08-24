/* Question 15:Write a program to print Following Pattern
	
	1
	2*2
	3*3*3	
	4*4*4*4
	5*5*5*5*5
	5*5*5*5*5
	4*4*4*4
	3*3*3
	2*2

*/

class Star7{

	public static void main(String [] args){

	int n = 5;

	for(int i = 1; i <= n; i++){
		System.out.print(i);
		for(int j = 1; j < i; j++){
		
		System.out.print("*"+i);
	
		}
		System.out.println();
	
	}
	int p  = 5;
	for(int i = 1; i <= n; i++){
		if(p == 1)
		break;
		System.out.print(p);
		for(int j = 1; j <= 5-i; j++){
		
		System.out.print("*"+p);
		
		}
		p = p - 1;
		System.out.println();
		
	}		

	
	}

}