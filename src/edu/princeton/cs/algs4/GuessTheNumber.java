package edu.princeton.cs.algs4;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
	public static void main(String[] args) {
		int theNumber = ThreadLocalRandom.current().nextInt(1, 101);
		//Alternative way:
		//int theNumber = 1 + (int) (Math.random() * 100);
		StdOut.println("Hit me with a number between 1 and 100");
		int yourGuess = 0;
		while (yourGuess != theNumber) {
			StdOut.println("Hit me");
			yourGuess = StdIn.readInt();
			if 		(yourGuess == theNumber) StdOut.println("Bingo");
			else if (yourGuess < theNumber) StdOut.println("too low");
			else							StdOut.println("too high");
		}
	}
}
