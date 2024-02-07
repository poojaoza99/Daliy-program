import java.util.Scanner;
class ArmstrongNumberCheck 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the entered number is an Armstrong number
        if (isArmstrongNumber(number)) 
	{
            System.out.println(number + " is an Armstrong number.");
        } else 
	{
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrongNumber(int num) 
	{
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) 
	{
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
