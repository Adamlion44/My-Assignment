package Lesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator
{
	public static void main(String[] arg) 
	{	
		// count controlled while loop
		// flag controlled while loop
		// sentinel controlled while loop
		Scanner scanner =new Scanner(System.in);
		float lessonDegre=0;
		float grade=0;
		int count=0;
		while (grade!=-1) 
		{	
			try
			{
				System.out.println(" Enter Your Grade Degree# "+(count+1)+": ");
				grade =scanner.nextFloat();
		    	if (grade!=-1)
		    		//with this code you can finish the Calculation all degree
		    	{
		    		System.out.println("When you finish click -1");
		    		lessonDegre+=grade;
		    		count++;
		    	}
			}
			catch (InputMismatchException e) 
            {
				System.out.println("Wrong! Please enter a valid number.");
				scanner.nextLine(); //this code for invalid inputs,Clear the invalid input from scanner buffer.
            }
		}
		System.out.println("avg ="+ lessonDegre/ count);	
		//this code use to Calculate all degree and divide to get the Average
		while (true) 
		{
			try
			{
				System.out.println(" Enter Your Degree");	
				System.out.println("When you finish click 0");
				int degree = scanner.nextInt();
				if (degree>100 || degree<=0) 
					//this code you can use for finish the Calculator Grade
				{
					System.out.println("Thank you for using my calculator  ");	
					break;
				}
				// i use this code to check the degree grade so i can give the score
				if (degree>=90) 
				{
					if (degree >= 95) {System.out.println("You Are Perfect ");}
					else {System.out.println("Grade: A - ");}
				}

				else if (degree>=80) 
				{
					if (degree >= 85) {System.out.println("You Are Very Good ");}
					else {System.out.println("Grade: B - ");}
				}
				else if (degree>=70)
				{
					if (degree >= 75) {System.out.println("You Are Satisfactory ");}
					else {System.out.println("Grade: C - ");}
				}
				else if (degree>=60)
				{
					if (degree >= 65) {System.out.println("You Are Passing ");}
					else {System.out.println("Grade: D - ");}
				}

				else {	System.out.println(" You Are Failure  ");}
			}	
			catch (InputMismatchException e) 
            {
            System.out.println("Wrong! Please enter a valid number.");
            scanner.nextLine(); //this code for invalid inputs,Clear the invalid input from scanner buffer.
            }
		}
		scanner.close();
	}
}
