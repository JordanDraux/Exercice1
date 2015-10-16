package Pack;

public class General 
{
	public static void main(String[] args) 
	{
		int compteur = 0;
		do
		{
			compteur++;
			Bizz(compteur);
			Buzz(compteur);
			System.out.println(compteur);
		}while(compteur<100);
		
		
	}
	
	static void Bizz(int n)
	{
		for(int x=0; x<100 ; x=x+3)
		{
		if(n==x)
		System.out.println("Bisous mon chou");
		}
	}
	
	static void Buzz(int n)
	{
		for(int x=0; x<100 ; x=x+5)
		{
		if(n==x)
		System.out.println("Bisous mon chou");
		}
	}
}
