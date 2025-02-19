public class Diamond
{
	public static void main(String []args)
	{
		for (int a=1; a<=5; a++)
		{
			for(int b=a; b<=5; b++)
				System.out.print(" ");
			for(int c=1; c<a; c++)
				System.out.print("*");
			for(int d=1; d<=a; d++)
				System.out.print("*");
		System.out.println();
		}
		for (int e=1; e<=5; e++)
		{
			for(int f=1; f<=e; f++)
				System.out.print(" ");
			for(int g=e; g<5; g++)
				System.out.print("*");
			for(int h=e; h<=5; h++)
				System.out.print("*");
		System.out.println();	
		}
	}
}