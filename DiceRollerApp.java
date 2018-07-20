/*Jasmine S. Allen
 * July 18, 2018
 * Program: Ask the user to enter the number of sides for a pair of dice. Prompt the 
 * 			user to roll the dice. "Roll" two n-sided dice, display the results of each, 
 * 			and then ask the user if they want to roll the dice again.
 */

import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		
		System.out.println();
		
		playGame(scan);
		
		System.out.println("Thanks for playing!");
	}
		
	public static void playGame(Scanner scan)
	{
		String choice = "y";
		int sides;
		int die1;
		int die2;
		int count = 1;
		
		do {
			//ask for sides
			System.out.print("How many sides should each die have: ");
			sides = scan.nextInt();
			
			//roll dice
			die1 = randomNumGenerator(1, sides);
			die2 = randomNumGenerator(1, sides);

			//make it pretty!
			System.out.println("Roll " + count + ":");
			System.out.printf("%-15s", "=======");
			System.out.println();
			System.out.println(die1);
			System.out.println(die2);

			System.out.println();
			
			if(die1 == 1 && die2 == 1)
				System.out.println("You've got SNAKE EYES!!");
			else if(die1 == 6 && die2 == 6)
				System.out.println("You've got BOXCARS!!");
			else if((die1 + die2 == 7) || (die1 + die2 == 11))
				System.out.println("You've got " + (die1 + die2) + "!!");

			//update choice
			System.out.print("Do you want to roll again? (y/n)?  ");
			choice = scan.next();
			System.out.println();
			System.out.println();
			count++;
		}while(choice.matches("[yY].*"));
	}

	public static int randomNumGenerator(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	
	
	
	
}
