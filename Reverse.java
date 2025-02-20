import java.util.Scanner;
public class Reverse
{
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sequence of Intigers: ");
		int num=sc.nextInt();
		
		while (num>0)
		{
			int rev=num%10;
			System.out.print(rev);
			num=num/10;
		}	
		
	}
}