package Lesson;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PrimeNumbers 
{
    public static void main(String[] arg) 
    {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int end = 0;

        // Input validation for start
        boolean valid = false;
        while (!valid) 
        {
            try 
            {
                System.out.println("Enter you'r number:");
                start = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e)
            {
                System.out.println("Wrong! Please enter a valid number.");
                scanner.nextLine();
            }
        }

        // Input validation for end
        valid = false;
        while (!valid) 
        {
            try
            {
                System.out.println("Enter you'r number:");
                end = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) 
            {
                System.out.println("Wrong! Please enter a valid number.");
                scanner.nextLine();
            }
        }

        // Prime calculation (minimal changes)
        for (int i = Math.max(start, 2); i <= end; i++)
        {
        	// Start from at least 2
            boolean isPrime = true;
            for(int j = 2; j < i; j++) 
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) 
            {
                System.out.println(i + " is prime"); 
            }
        }
        scanner.close();
		// This code to close the scanner 

    }
}