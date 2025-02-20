public class Pattern3
{
	public static void main (String []args)
	{
		for (int i=1; i<=5; i++)
		{
			for(int j=i; j<=5; j++)
			{
				System.out.print(" ");
			}
				
			for(int  a=1; a<=i; a++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for (int b=1; b<=5; b++)
		{
			for(int c=0; c<=b; c++)
			{
				System.out.print(" ");
			}
				
			for(int  d=b; d<=4; d++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}