import java.util.Scanner;
class SumCalculator1
{

    // Method to calculate the sum of two integers
    public static int calculateSum(int num1, int num2) 
    {
        return num1 + num2;
    }

    // Method to calculate the sum of three integers
    public static int calculateSum(int num1, int num2, int num3) 
    {
        return num1 + num2 + num3;
    }

    // Method to calculate the sum of an array of integers
    public static int calculateSum(int[] numbers)
    {
        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) 
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of digits on which sum operation is to be performed: ");
        int numOfDigits = scanner.nextInt();

        if (numOfDigits >= 2) 
        {
            // For two digits
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int resultTwoDigits = calculateSum(num1, num2);
            System.out.println("Sum of two digits: " + resultTwoDigits);
        }

        if (numOfDigits >= 3) 
        {
            // For three digits
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            int resultThreeDigits = calculateSum(num1, num2, num3);
            System.out.println("Sum of three digits: " + resultThreeDigits);
        }

        if (numOfDigits >= 4) 
        {
            // For an array of digits
            System.out.print("Enter the number of elements in the array: ");
            int arraySize = scanner.nextInt();

            int[] numbersArray = new int[arraySize];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < arraySize; i++)
            {
                numbersArray[i] = scanner.nextInt();
            }

            int resultArray = calculateSum(numbersArray);
            System.out.println("Sum of array elements: " + resultArray);
        }

        scanner.close();
    }
}
