import java.util.Scanner;
class ReverseOrderSum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        scanner.close();
        String sumString = Double.toString(sum);
        System.out.println("Sum: " + sum);
        System.out.print("Sum in reverse order: ");
         
        for (int i = sumString.length() - 1; i >= 0; i--) 
        {
            System.out.print(sumString.charAt(i));
        }
    }
}

import java.util.Scanner;

public class ReverseOrderSum 
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the original sum
        System.out.println("Sum: " + sum);

        // Display the sum in reverse order
        System.out.print("Sum in reverse order: ");
        displayReverseOrder(sum);

        // Close the Scanner
        scanner.close();
    }

    // Function to display a number in reverse order
    private static void displayReverseOrder(int number) {
        // Convert the number to a string
        String numString = Integer.toString(number);

        // Iterate through the characters in reverse order and print them
        for (int i = numString.length() - 1; i >= 0; i--) {
            System.out.print(numString.charAt(i));
        }

        // Print a new line for better formatting
        System.out.println();
    }
}
