import java.util.Scanner;
class GreatestNumber 
{
    public static void main(String[] args) 
     {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter five numbers
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) 
       {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Prompt the user to choose an option
        System.out.println("Choose an option:");
        System.out.println("1. Find the greatest number");
        System.out.println("2. Exit");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice)
      {
            case 1:
                // Find the greatest number among the entered numbers
                int greatestNumber = findGreatestNumber(numbers);
                System.out.println("The greatest number is: " + greatestNumber);
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

    // Function to find the greatest number among an array of numbers
    private static int findGreatestNumber(int[] numbers) 
     {
        int greatest = numbers[0];

        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > greatest) 
            {
                greatest = numbers[i];
            }
        }

        return greatest;
    }
}
