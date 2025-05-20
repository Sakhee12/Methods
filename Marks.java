import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MArks: ");
		float marks = sc.nextFloat();
		//marks>=35;
		//String pass = (marks>=35 && marks<=100)?("pass"):("fail");
		//String pass = (marks>=75)?("A"):((marks<=60)?("B"):((marks>=35)?("C"):("fail")));
		String pass = (marks>=35)?("C"):(marks>=75)?("A"):((marks<=60)?("B"):("fail"));
		System.out.println(pass);
	}
}
