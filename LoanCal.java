import java.util.Scanner;
class LoanCal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.println("Enter the Rate of Interrest: ");
		float roi = sc.nextFloat();
		System.out.println("Enter the tenure(months): ");
		int month = sc.nextInt();

		//convert from months to years

		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);
  
		System.out.println("");
		System.out.println("Loan Calculation");
		System.out.println("Principal Amount :"+amount);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure : "+month+ "months");

        float interestYear = amount*roi/100;
		float totalInter = interestYear*con;
		System.out.println("Interest : "+totalInter);
		float outStanding = amount+totalInter;;;;
		System.out.println("Total Outstanding Amount : "+ (outStanding));
		System.out.println("Emi : "+(outStanding/month)+"rs");

	//p*r*n/100
	
	/*float fi=(amount*roi*con)/100;
	System.out.println(fi);
	*/
	}

}
