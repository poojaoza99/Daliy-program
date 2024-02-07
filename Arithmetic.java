/**
 * Java program to perform all arithmetic operations.
 */


public class Arithmetic {
4

   public static void main(String[] args) {8
        
        // Create scanner class object
        Scanner in = new Scanner(System.in);

        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        

        // Perform arithmetic operations.
        int sum 		= num1 + num2;
        int difference 	= num1 - num2;
        int product 	= num1 * num2;
       
        

        // Print result to console.
        System.out.println("Sum : "         + sum);
        System.out.println("Difference : "  + difference);
        System.out.println("Product : "     + product);
   }
}