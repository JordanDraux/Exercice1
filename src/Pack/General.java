package Pack;

public class General 
{
	public static void main(String[] args) 
	{
		BizzBuzz(3);
	}
	
	static void BizzBuzz(int n)
	{
		for(int x=0; x<100 ; x=x+3)
		{
		if(n==x)
		System.out.println("Bisous mon chou");
		}
		
		for(int x=0; x<100 ; x=x+5)
		{
		if(n==x)
		System.out.println("Bisous mon chou");
		}
	}
}
