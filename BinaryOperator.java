import java.util.Scanner;
class BinaryOperator
{
    	public static void main(String[] args) 
	{
       		 // Create a Scanner object for user input
       		 Scanner scanner = new Scanner(System.in);

        	// Input two numbers
        	System.out.print("Enter the first number: ");
       		 double num1 = scanner.nextDouble();

        	System.out.print("Enter the second number: ");
        	double num2 = scanner.nextDouble();

        	// Arithmetic operators
        	double additionResult = num1 + num2;
        	double subtractionResult = num1 - num2;
       		double multiplicationResult = num1 * num2;
       		double divisionResult = num1 / num2;
        	double modulusResult = num1 % num2;

        System.out.println("\nArithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + additionResult);
        System.out.println(num1 + " - " + num2 + " = " + subtractionResult);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationResult);
        System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        System.out.println(num1 + " % " + num2 + " = " + modulusResult);

        // Relational operators
        boolean equalResult = num1 == num2;
        boolean notEqualResult = num1 != num2;
        boolean lessThanResult = num1 < num2;
        boolean greaterThanResult = num1 > num2;
        boolean lessThanOrEqualResult = num1 <= num2;
        boolean greaterThanOrEqualResult = num1 >= num2;

        System.out.println("\nRelational Operations:");
        System.out.println(num1 + " == " + num2 + " : " + equalResult);
        System.out.println(num1 + " != " + num2 + " : " + notEqualResult);
        System.out.println(num1 + " < " + num2 + " : " + lessThanResult);
        System.out.println(num1 + " > " + num2 + " : " + greaterThanResult);
        System.out.println(num1 + " <= " + num2 + " : " + lessThanOrEqualResult);
        System.out.println(num1 + " >= " + num2 + " : " + greaterThanOrEqualResult);

        // Logical operators
        boolean logicalAndResult = num1 > 0 && num2 > 0;
        boolean logicalOrResult = num1 > 0 || num2 > 0;
        boolean logicalNotResult = !(num1 > 0);

        System.out.println("\nLogical Operations:");
        System.out.println(num1 + " > 0 && " + num2 + " > 0 : " + logicalAndResult);
        System.out.println(num1 + " > 0 || " + num2 + " > 0 : " + logicalOrResult);
        System.out.println("!(" + num1 + " > 0) : " + logicalNotResult);

        // Bitwise operators (converting numbers to integers for bitwise operations)
        int intNum1 = (int) num1;
        int intNum2 = (int) num2;
        int bitwiseAndResult = intNum1 & intNum2;
        int bitwiseOrResult = intNum1 | intNum2;
        int bitwiseXorResult = intNum1 ^ intNum2;
        int leftShiftResult = intNum1 << 1;
        int rightShiftResult = intNum1 >> 1;

        System.out.println("\nBitwise Operations:");
        System.out.println(intNum1 + " & " + intNum2 + " : " + bitwiseAndResult);
        System.out.println(intNum1 + " | " + intNum2 + " : " + bitwiseOrResult);
        System.out.println(intNum1 + " ^ " + intNum2 + " : " + bitwiseXorResult);
        System.out.println(intNum1 + " << 1 : " + leftShiftResult);
        System.out.println(intNum1 + " >> 1 : " + rightShiftResult);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}
