import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
