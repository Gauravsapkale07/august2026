class grade{
	public static void main(String [] args){
	
	int marks = 85;
	if(marks>=90)
		System.out.println("Average marks : "+marks+"\nGrade : A");
	else if(marks>=70)
		System.out.println("Average marks : "+marks+"\nGrade : B");
	else if(marks>=50)
		System.out.println("Average marks : "+marks+"\nGrade : C");
	else if(marks>=30)
		System.out.println("Average marks : "+marks+"\nGrade : D");
	else
		System.out.println("Average marks : "+marks+"\n Fail ");
	}
}