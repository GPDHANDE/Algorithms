package org.BridgeLabs.AlgoritmProgrms;

import java.util.Scanner;

public class p10 {

	public static void main(String[] args) 
	{
		
		 if (args.length != 1) {
	            System.out.println("Usage: java GuessYourNumber <N>");
	            return;
	        }

	        int N = Integer.parseInt(args[0]);
	        int numGuesses = (int) (Math.log(N) / Math.log(2)); // Calculate the number of guesses needed (log base 2 of N)

	        System.out.println("Think of a number between 0 and " + (N - 1));

	        // Perform binary search to guess the number
	        int low = 0;
	        int high = N - 1;
	        Scanner scanner = new Scanner(System.in);

	        for (int i = 0; i < numGuesses; i++) {
	            int guess = (low + high) / 2;
	            System.out.println("Is your number less than or equal to " + guess + "? (true/false)");
	            boolean isLessThanOrEqual = scanner.nextBoolean();
	            if (isLessThanOrEqual) {
	                high = guess; // Number is less than or equal to the guess
	            } else {
	                low = guess + 1; // Number is greater than the guess
	            }
	        }

	        // After the last guess, high should be the correct number
	        System.out.println("Your number is: " + high);

	        scanner.close();
	    

	}

}
