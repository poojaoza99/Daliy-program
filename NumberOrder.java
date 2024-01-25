import java.util.Scanner;
import java.util.Arrays;
class NumberOrder 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Accept the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[size];

        // Accept numbers from the user
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the greater and smallest number
        int greater = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < size; i++)
        {
            if (numbers[i] > greater) 
            {
                greater = numbers[i];
            }

            if (numbers[i] < smallest) 
            {
                smallest = numbers[i];
            }
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display results
        System.out.println("Greater Number: " + greater);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Ascending Order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        for (int i = 0; i < size / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

        // Display descending order
        System.out.println("Descending Order: " + Arrays.toString(numbers));

        scanner.close();
    }
}
