package Lesson;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class NumberGuessingGame 
{
	public static void main(String[] arg) 
	{
		Scanner reader = new Scanner(System.in);
		String play = "yes";
		// while loop to determine if we are going to ply the game again
		while (play.equals("yes"))
		{
			System.out.println("Guess anumber between 1 and 100 : ");
			Random rand = new Random();
			// I use a random method for the guessing game 
			int randNum = rand.nextInt(100) + 1;
			int guess = -1;
			int tries =0;
			//while loop to check if the game is over
			while(guess != randNum)
			{
				try
				{
					guess = reader.nextInt();
					tries++;
					if (guess == randNum)
					{
						System.out.println("Awesome! You guessed the number!");
						System.out.println("It only took you " + tries + " guessed!");
                        // Try-based scoring
                        if (tries == 1) 
                        {
                            System.out.println("Score: 🏆 PERFECT (1 try!)");
                        } else if (tries <= 3) 
                        {
                            System.out.println("Score: 🌟 EXCELLENT (" + tries + " tries)");
                        } else if (tries <= 5) 
                        {
                            System.out.println("Score: 👍 GOOD (" + tries + " tries)");
                        } else if (tries <= 7) 
                        {
                            System.out.println("Score: 🙂 AVERAGE (" + tries + " tries)");
                        } else 
                        {
                            System.out.println("Score: 💪 KEEP TRYING (" + tries + " tries)");
                        }
						System.out.println("Would you like to play again? Yes or No: ");
						play = reader.next().toLowerCase();
					}
					else if(guess > randNum)
						// This code for if the guess is Correct answer  

					{
						System.out.println("Your guess is too high, ty again");
						// This code for if the guess is too high 
					}
					else
					{
						System.out.println("Your guess is too low, ty again");
						// This code for if the guess is too low

					}
				}
				 catch (InputMismatchException e)
				{
	                System.out.println("Invalid input! Please enter numbers only.");
	                reader.nextLine(); 
	                // Clear the invalid input from scanner buffer
	            }
			}
		}
		reader.close();			
		System.out.println("Thank you for playing my game ");
		// This code to close the scanner 
	}
}
