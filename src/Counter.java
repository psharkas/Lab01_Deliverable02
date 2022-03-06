import java.util.Scanner;
import java.util.Random;

public class Counter {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Guess which will have more: heads or tails? ");
		String headsOrTailsGuess​ = scnr.nextLine();
		System.out.println("How many times shall we flip a coin?");
		int numberOfFlips​ = scnr.nextInt();
		System.out.println("You want " + headsOrTailsGuess​ + " and " + numberOfFlips​ + " amount of flips!");
		
		int upperBound = 2;
		int correctCount = 0;
		
		for (int i = 0; i < numberOfFlips​; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt(upperBound);
			
			if (randomNum == 0) {
				if (headsOrTailsGuess​.equals("heads")) {
					correctCount += 1;
				}
				System.out.println("heads");
			}
		
			else if (randomNum == 1){
				if (headsOrTailsGuess​.equals("tails")) {
					correctCount += 1;
				}
				System.out.println("tails");
			}
		}
		
		float count = correctCount;
		float percentage = (count/numberOfFlips​)*100;
		System.out.println("Your guess, " + headsOrTailsGuess​ + ", came up " + correctCount + " time(s).");
		System.out.println("That's " + percentage + "%!");
	}
}












