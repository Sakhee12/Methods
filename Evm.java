import java.util.Scanner;
class Evm 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;
		System.out.println();
		System.out.println("            WELCOME");
		System.out.println();
		System.out.println("Enter the Population: ");
		int population = sc.nextInt();

		for(int i=1; i<=population; i++)
		{
			System.out.println();
			System.out.println(" List Of Parties ");
			System.out.println("1.Bjp ");
			System.out.println("2.Cng ");
			System.out.println("3.ss");
			System.out.println("4.AAP");
			System.out.println("5.Mns");
			System.out.println("6.NOTA");
			System.out.println();
			System.out.println("Enter the Option: ");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("ACHE DIN AYEGE");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("Bhart todo");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("hum hai asli sena");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("Mujhe Azad karo");
				}
				if(opt==5)
				{
					cng++;
					System.out.println("Jai MAharashtra");
				}
				if(opt==6)
				{
					nota++;
					System.out.println("You are an educated person");
				}
				if(!(opt>=1 && opt<=6))
				{
					i--;
					System.out.println("Invalid Option");
				}

	}
	if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
		         System.out.println("Bjp Has won The Election:"+bjp);
			}
	if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
		         System.out.println("cng Has won The Election:"+cng);
			}
    if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=nota)
			{
		         System.out.println("ss Has won The Election:"+ss);
			}
	if(aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
			{
		         System.out.println("Aap Has won The Election:"+aap);
			}
	if(mns>=cng && mns>=ss && mns>=aap && mns>=bjp && mns>=nota)
			{
		         System.out.println("MNs Has won The Election:"+mns);
			}
	if(nota>=cng && nota>=ss && nota>=aap && nota>=mns && nota>=bjp)
			{
		         System.out.println("Nota Has won The Election:"+nota);
			}
		}
}
}
