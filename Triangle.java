public class Triangle
{
	public static void main(String []args)
	{
		for (int i=1; i<=5; i++)				//*
		{							//**
			for(int j=1; j<=i; j++)				//***
			{						//****
				System.out.print("*");			//***** 
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int x=1; x<=5; x++)				//*****
		{							//****
			for(int y=x; y<=5; y++)				//***
			{						//**
				System.out.print("*");			//*
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int x=1; x<=5; x++)				//     *
		{							//    **
			for(int y=x; y<=5; y++)				//   ***
			{						//  ****
				System.out.print(" ");			// *****
			}
			for (int a=1; a<=x; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();					
		
		
		for (int b=1; b<=5; b++)				
		{										
			for(int c=1; c<=b; c++)				// *****
			{						//  ****
				System.out.print(" ");			//   ***
			}						//    **
			for (int d=b; d<=5; d++)			//     *
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for (int e=1; e<=5; e++)				//     *
		{							//    **
			for(int f=e; f<=5; f++)				//   ***
			{						//  ****
				System.out.print(" ");			// *****
			}
			for (int g=1; g<e; g++)
			{
				System.out.print("*");
			}
			for (int h=1; h<=e; h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
