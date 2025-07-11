import java.util.Scanner;
public class StringExample

{
public static void main(String [] arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your Gender:(m/f)");
	char gender=sc.nextLine().charAt(0);
	
	System.out.println("Enter your first Name: ");
	String fname=sc.nextLine();
	
	System.out.println("Enter your last Name: ");
	String lname=sc.nextLine();
	
	/**switch (gender){
	 case 'm' :
	 System.out.println("Your name with initials is: "+fname.charAt(0)+"."+lname);
	 break;
	 case 'f' :
	 System.out.println("Your name with initials is: "+lname.charAt(0)+"."+fname);
	break;}*/
	
	
	
	if (gender.equales("m") );
	{
		System.out.println("Your name with initials is: "+fname.charAt(0)+"."+lname);
	}
	
	//else(gender.equales("f") );
	{
		System.out.println("Your name with initials is: "+lname.charAt(0)+"."+fname);
	}
	//System.out.println("Your name with initials is: "+fname.charAt(0)+"."+lname);
	//System.out.println("Your first nam length is: "+int fname length());
}
}