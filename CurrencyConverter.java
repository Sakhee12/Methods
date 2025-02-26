import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("ENTER THE RUPPES: ");
		double rup = new Scanner(System.in).nextInt();
		System.out.println("MAIN START");
		ruppesToDollar(rup);
		System.out.println("MAIN ENDS");
		
	}

	public static void ruppesToDollar(double rup)
	{
		System.out.println("ruppesToDollar start");
		double dollar = rup/87.15;
		System.out.println(dollar);
		dollarToEuro(dollar);
		System.out.println("ruppesToDollar end");
	}

	public static void dollarToEuro(double dollar)
	{
		System.out.println("dollarToEuro start");
		double euro = dollar*0.95;
		System.out.println(euro);
		euroToDhiram(euro);
		System.out.println("dollarToEuro end");
	}

	public static void euroToDhiram(double euro)
	{
		System.out.println("euroToDhriram start");
		double dhiram = euro*3.85;
		System.out.println(dhiram);
		System.out.println("euroToDhriram end");

	}
}
