package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignemnt2 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int number = Math.abs(r.nextInt()%100)+1;
		
		int guesses = 0;
		
		int guess;
		
		Scanner read = new Scanner(System.in);
	
			while(guesses<5) {
		
				System.out.print("Pick a number between 1-100: ");
				guess = read.nextInt();
		
				if(guess<1 || guess>100) {
					System.out.println("Your guess is not between 1 and 100. Please try again");
					guess++;
				}
		
				else if(guess < number) {
					System.out.println("Please pick a higher number");
					guesses++;
				}
				else if(guess > number) {
			System.out.println("Please pick a lower number");
				}
		
				else {
					break;
				}
			}
			read.close();
	
			if(guesses==5) {
				System.out.println("You lose, the number to guess was "+number);
			}
	
			else {
				System.out.println("You win!");
			}
	}
}
		
	
		
	
	

