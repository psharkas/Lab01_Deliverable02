import java.util.Scanner;
import java.util.Random;

// we need this for formatting our final percentage to two decimal places
import java.text.DecimalFormat;

public class Counter {

	public static void main(String[] args) {
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails? ");
		String headsOrTailsGuess​ = scnr.nextLine();
		
		// Checks to see if user input heads or tails, if not, loops until user selects one.
		while (!((headsOrTailsGuess​.equals("heads")) || (headsOrTailsGuess​.equals("tails")))) {
			System.out.println("You didn't type heads or tails, please try again.");
			headsOrTailsGuess​ = scnr.nextLine();
		}
		
		System.out.println("How many times shall we flip a coin?");
		int numberOfFlips​ = scnr.nextInt();
		
		// Checks to see if user inputs a positive integer, if not, loops until user selects a positive number.
		while (numberOfFlips​ < 0) {
			System.out.println("You didn't type in a positive number, please try again.");
			numberOfFlips​ = scnr.nextInt();
		}
		
		System.out.println("You want " + headsOrTailsGuess​ + " and " + numberOfFlips​ + " amount of flips!");
		Random rand = new Random();
		
		// upperBound allows us to select numbers 0-1 (2) is excluded
		int upperBound = 2;
		int correctCount = 0;

		for (int i = 0; i < numberOfFlips​; i++) {
			int randomNum = rand.nextInt(upperBound);
			
			// if the random generated number is 0, it's equivalent to heads
			if (randomNum == 0) {
				if (headsOrTailsGuess​.equals("heads")) {
					correctCount += 1;
				}
				System.out.println("heads");
			}
			// Same logic as above, but for tails
			else if (randomNum == 1){
				if (headsOrTailsGuess​.equals("tails")) {
					correctCount += 1;
				}
				System.out.println("tails");
			}
		}
		
		// float is needed when we want an accurate percentage
		float count = correctCount;
		float percentage = (count/numberOfFlips​)*100;
		
		// New instance of the formatting class
		DecimalFormat df = new DecimalFormat("###.##");
		
		System.out.println("Your guess, " + headsOrTailsGuess​ + ", came up " + correctCount + " time(s).");
		System.out.println("That's " + df.format(percentage) + "%!");
	}
}
