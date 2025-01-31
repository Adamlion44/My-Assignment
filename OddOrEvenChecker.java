package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEvenChecker 
{
	public static void main(String[] arg) 
	{
		Scanner reader = new Scanner(System.in);
		int num;
		int countEven = 0, countOdd = 0;
		int validNumbersEntered  = 0;
		//in here i Declaration and Initialization to know what i'm doing
		while (validNumbersEntered  < 2) 
		{
			try
			{
				System.out.println("Enter you'r number:");
				num = reader.nextInt();
				if (num % 2 == 0)
				{
					countEven++;
				}
				else
				{
					countOdd++;
				}
				validNumbersEntered ++;
				//i use this code to get the even count number and odd count number
			}
			catch (InputMismatchException e) 
            {
                System.out.println("Wrong! Please enter a valid number.");
                reader.nextLine(); // Clear the invalid input from scanner buffer
            }
		}
		System.out.println("The sum of Even numbers = " + countEven);
		System.out.println("The sum of Odd numbers = " + countOdd);
		reader.close();
	}
}