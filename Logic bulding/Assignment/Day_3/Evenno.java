class Evenno{

	public void printEvenNumbers(){
	
	int i = 1;
	while(i<51){
		if(i%2 == 0)
			System.out.println(i);
		i++;
	}
}

	public static void main(String [] args){
	
	Evenno e1 = new Evenno();
	e1.printEvenNumbers();
	}
}