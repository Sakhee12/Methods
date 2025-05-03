import java.util.Scanner;
class BodyMassIndex 
{
	public static void main(String[] args) 
	{
		Scanner hg = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double pounds = hg.nextDouble();
		final double kgp = pounds*0.4535;

		System.out.println("ENter height in inches: ");
		double inches = hg.nextDouble();
        final double mi = inches*0.0254;

        double cal = (kgp/(mi*mi));
		System.out.println(cal+"is the conversion");


	}
}
