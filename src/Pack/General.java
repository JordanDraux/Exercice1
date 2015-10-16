package Pack;

public class General 
{
	public static void main(String[] args) 
	{
		Bizz(6);
		
	}
	
	static void Bizz(int n)
	{
		for(int x=0; x<100 ; x=x+3)
		{
		if(n==x)
		System.out.println("Bisous mon chou");
		}
	}
}
