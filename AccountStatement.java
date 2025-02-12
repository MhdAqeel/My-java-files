import java.util.Scanner;
public class AccountStatement
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your previous balance:$");
        double pvb =sc.nextDouble();
        System.out.println("Enter the total amount of additional charges during the month:$");
        double addc=sc.nextDouble();

        double intrest;   
        if (pvb<=0)
        {
            intrest=0;
        }
        else 
        {
            intrest=(pvb+addc)*0.02;
        }

        double tnb=(pvb+addc+intrest);

        double mp;    //mp=minimum payment

        if (tnb<50) 
        {
           mp=tnb; 
        }
        else if (50<=tnb && tnb<=300)
        {
            mp=50;
        }
        else
        {
            mp=tnb*0.2;
        }


        System.out.println("your previous balance is :$"+pvb);
        System.out.println("your additional charges are :$"+addc);
        System.out.println("intrest:$ "+ intrest);
        System.out.println("your total new balance is:$"+tnb);
        System.err.println("minimum paiment:$"+mp);
    }
}