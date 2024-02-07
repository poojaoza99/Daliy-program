
import java.util.Scanner;
class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose an option
        System.out.println("Choose an option:");
        System.out.println("1. Display Fibonacci Series");
        System.out.println("2. Exit");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) 
        {
            case 1:
                // Prompt the user to enter the number of terms in the Fibonacci series
                System.out.print("Enter the number of terms in the Fibonacci series: ");
                int numTerms = scanner.nextInt();

                // Display the Fibonacci series
                displayFibonacciSeries(numTerms);
                break;
            case 2:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to display the Fibonacci series
    private static void displayFibonacciSeries(int numTerms) 
    {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < numTerms; i++) 
        {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
