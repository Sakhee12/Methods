import java.util.Scanner;
class EmipNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		int num = new Scanner(System.in).nextInt();
        int dup = num;
		int rev =0;
		int den = 2;

        //Prime no finding
		while(den<=num/2) 
        {
			if(num%den==0)
			{
				break;
			}
			den++;
        }
		if(den>num/2)
		{
			System.out.println("is prime");//1st no prime
		}
		else
		{
			System.out.println("NOT PRIME");
		}
		while(num>0)
		    {
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		    }
		System.out.println("The rev of the "+dup+ " is "+rev);//1st no rev
		}	
		while(den<rev) 
        {
			if(rev%den==0)
			{
				break;
			}
			den++;
        }
		if(rev == den)
			System.out.println("IT IS EMIP NO ");//2nd no prime
		else
			System.out.println("not emip");
		
		}				
		
	}


	

