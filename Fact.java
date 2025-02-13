import java.util.Scanner;
public class Fact
{
	public static void main (String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number: ");
		int n=scan.nextInt();
		
		int fact=1;
		int num=1;
		while (num<=n)
		{
			fact=fact*num;
			num=num+1;
			
		}
		System.out.println(fact);
	

		
	}
}