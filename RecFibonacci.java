import java.util.*;
class RecFibonacci
{
	
	public static void main(String[] args) 
	{
		fibonacci(5,0,1); //5
	}

	public static void fibonacci(int num,int n1,int n2)
	{
		if (num>0)
		{
			int n3 = n1+n2;
			System.out.println(n1);
			fibonacci(--num,n2,n3);
		}
		return ;
	}
	
}


