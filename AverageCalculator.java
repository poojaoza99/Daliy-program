import java.util.Scanner;
class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        // Check if the size is valid
        if (size <= 0) {
            System.out.println("Invalid array size. Please enter a positive value.");
            return;
        }

        // Create an array to store numbers
        double[] numbers = new double[size];

        // Accept numbers from the user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate average
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        double average = sum / size;

        // Display the average
        System.out.println("\nAverage of the numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}
