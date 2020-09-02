package oops2;

import java.util.Scanner;

public class Guessing_number_game {
	
	public static void main(String[] args) {
	
	int randomNumber = (int)(Math.random() *100)+1;
	
	boolean hasWon = false;

	System.out.println("I have randomly chosen a nuber between 1 and 100.");
	
	System.out.println("Try to guess it.");
	
	Scanner input = new Scanner(System.in);
	
	for (int i=10; i>0; i--)
	{ 
		System.out.println("You have "+ i + " guesses left.");
		int guess = input.nextInt();
		
		if (randomNumber< guess) {
			System.out.println("Its smaller than "+ guess);
		}
		if (randomNumber > guess) {
			System.out.println(" Its greater than "+ guess);
		}
		if (randomNumber == guess) {
			hasWon = true;
			break;
		}
	}
	if (hasWon) {
		System.out.println(" You have guessed the correct number!");
	} else 
	{
		System.out.println("You lost the game. And the correct number is " + randomNumber);
	}
	
	}
	
}
