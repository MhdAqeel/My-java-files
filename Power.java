import java.util.Scanner;
public class Power
{
	public static void main (String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number for base: ");
		int n1=scan.nextInt();
		System.out.print("enter a number for power: ");
		int n2=scan.nextInt();
		
		int power=1;
		int count=0;
		
		while (count<n2)
		{
			power=power*n1;
			count=count+1;
		}
		System.out.printf(n1+"^"+n2+"="+"%,d",power);
	}
}	