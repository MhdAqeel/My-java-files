import java.util.Scanner;
public class LoopEx
{
	public static void main (String [] args)
	{
		/**for(int x=0;x<=10;x+=2)
		{
			System.out.println(x);

		}*/
		Scanner sc=new Scanner(System.in);
		
		int n;
		int count=0;
		int sum=0;
		while(count<10)
		{
			System.out.println("enter n");
			n=sc.nextInt();
			sum=sum+n; 
			count=count+1;
		}
		System.out.println("The summation of the numbers is : "+sum);
	}
	
}