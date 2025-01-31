package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] arg) 
	    {
	    Scanner scanner = new Scanner(System.in); // Single scanner for all inputs
		System.out.println("Java Calculator Program");
	    boolean running = true;

		while (running) 
		{
			try 
			{
				System.out.println("Enter two number only");
				System.out.println("After you enter the number press in the keyboard (Enter) button");
				double num1 =  scanner.nextDouble();
				double num2 =  scanner.nextDouble();
				scanner.nextLine(); // clear buffer
				
				System.out.println("Select operation Below:");
				System.out.println(". Addition (+)");
				System.out.println(". Subtraction (-)");
				System.out.println(". Multiplication (*)");
				System.out.println(". Division (/)");
				System.out.println(". Remainder (%)");
				System.out.println(". for quit (q)");

				String op = scanner.nextLine().trim();
				
				double result = 0;
				boolean isValidOperation = true; // Flag to check if the operation is valid
				switch (op) 
				{				
				    // System.out.println(num1 + " : " + num2); to get the results
					case "+":
					result = num1 + num2;
					    break;
					case "-": 
					{
						result = num1 - num2;
						break;
					}
					case "*": 
					{
						result = num1 * num2;
						break;
					}
					case "/":
					if (num1 == 0) 
					{
						System.out.println("Error: Division by zero is not allowed!");
						isValidOperation = false; //Not divided by zero Skip printing the result.
					}
					else if (num2 == 0) 
					{
						System.out.println("Error: Division by zero is not allowed!");
						isValidOperation = false; //Not divided by zero Skip printing the result.
					} 
					else
					result = num1 / num2;
					break;
					case "%":
				
					if (num1 == 0) 
					{
						System.out.println("Error: Remainder by zero is not allowed!");
						isValidOperation = false; //Not remainder by zero Skip printing the result,
					} 
					else if (num2 == 0) 
					{
						System.out.println("Error: Remainder by zero is not allowed!");
						isValidOperation = false; //Not remainder by zero Skip printing the result.
					} 
					else	
					{
						result = num1 % num2;
						break;
					}
					break;
					case "q":
	                        running = false;
	                        System.out.println("Exiting calculator. Goodbye!");
	                        break;
					default: 
                        System.out.println("Invalid operator!");
                        isValidOperation = false;
                        break;
                }

                if (isValidOperation && !op.equals("q")) 
                {
                    System.out.println("Result = " + result);
                    System.out.println("If you finish Type (q) to end the calculator ");
                }
            } 
			catch (InputMismatchException e) 
				{
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine();
                // Clear the invalid input from scanner buffer
				}
        }
		scanner.close();
    }
}