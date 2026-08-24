/* Question 22: Write a program to print the following pattern:

******
*    *
*    *
*    *
*    *
******

*/

class Star8{


	public static void printSimpleStar(){

	for(int i = 1; i <= 6; i++)
	{
		System.out.print("*");

	}
	System.out.println();
      }


	public static void main(String [] args){
	
	for(int i = 1; i <= 6; i++){
		if(i == 1 || i == 6){
			printSimpleStar();
			continue;
		}
		for(int j = 1; j <= 5; j++){
				
			
		if(j<2 || j>4)
			System.out.print('*');

		System.out.print(" ");
		}
		System.out.println();
				
		}

	}

	

}