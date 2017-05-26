package com.acadgild;

import java.util.Scanner;
/**
 * 
 * @author	Deepak Ray
 * @date	26/05/2017
 * @desc	To find greatest of three numbers
 */
public class Session2Assignment1 {

	public static void main(String[] args) {
		// Input three numbers
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int firstNumber=s.nextInt();
		System.out.print("Enter Second Number: ");
		int secondNumber=s.nextInt();
		System.out.print("Enter Third Number: ");
		int thirdNumber=s.nextInt();
		
		// Display the entered numbers
		System.out.println("You have entered "+ firstNumber +" "+secondNumber+" "+thirdNumber);
		
		// Determine if first number is greatest
		if (firstNumber>secondNumber)
		{
			if (firstNumber>thirdNumber)
			{
				System.out.println(firstNumber + " is greatest among "+firstNumber+" "+secondNumber+" and "+thirdNumber);
			}
			else
			{
				System.out.println(thirdNumber + " is greatest among "+firstNumber+" "+secondNumber+" and "+thirdNumber);
			}
		}
		else if (secondNumber>thirdNumber)
		{
			System.out.println(secondNumber + " is greatest among "+firstNumber+" "+secondNumber+" and "+thirdNumber);
		}
		else
		{
			System.out.println(thirdNumber + " is greatest among "+firstNumber+" "+secondNumber+" and "+thirdNumber);
		}
		s.close();
	}

}
