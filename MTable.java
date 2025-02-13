import java.util.Scanner;
public class MTable
{
	public static void main (String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a positive intiger: ");
		int n=scan.nextInt();
		int x=0;
		int m=0;
		while (x<=10)
		{
			m=n*x;
			System.out.println(n+"*"+x+"="+m);
			x=x+1;
		}
		
	}
}