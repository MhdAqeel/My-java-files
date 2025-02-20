public class Patterm4
{
	public static void main(String []args)
	{
		for (int a=1; a<=5; a++)
		{
			for(int b=a; b<=4; b++)
			{
				System.out.print(" ");
			}
			for (int c=1; c<=a; c++)
			{
				for (int d=2; d<=c; d++)
				{
					System.out.print("A");
				}
				System.out.print("*");
			}
		System.out.println();
		}
	}
}