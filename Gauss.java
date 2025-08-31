import java.util.Scanner;
public class Gauss {

    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the number x: ");
        double x = Scan.nextDouble();
        System.out.print("Enter the number of terms n: ");
        int n = Scan.nextInt();
        Scan.close();

        double sum = 0;
        double term = 1;

        for (int i = 0; i < n; i++) 
        {
            sum += term;

            if (i < n-1) 
            { 
                term= -term*(x*x)/(i+1);
            }
        }

        System.out.println("exp(-"+ x +"^2) = " + sum);
    }
}