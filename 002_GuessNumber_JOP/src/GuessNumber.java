import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {

	private int lowerLimit = 0;
	private int upperLimit = 10;
	int guessLimit = 3;

	Random rand = new Random();

	Scanner keyboard = new Scanner(System.in);

	// GuessNumber myGuess = new GuessNumber();

	// 1. set lower and upper bounds on the numbers
	// 2. pick a random number in that range
	// 3. start looping
	// guess
	// check for win
	// if win congrats
	// if no win repeat
	// set a guess limit

	public GuessNumber() {

	}

	public void startGame() {

		Boolean gameRunning = true;
		int guess;
		int countLimit = 5;
		String guessMsg = "";

		// grabs a random number
		int answer = rand.nextInt(upperLimit) + lowerLimit;
		//System.out.println("answer for debug" + answer);
		//startMsg = "answer for debug = " + answer;
		//JOptionPane.showMessageDialog(null, startMsg);
		// upperLimit - 1 because it is exclusive, stops 1 number before
		while (gameRunning && countLimit > 0) {
			countLimit--;
			guessMsg = "Please enter your guess, between " + lowerLimit + " and " + (upperLimit - 1);
			//JOptionPane.showMessageDialog(null, guessMsg);
			//System.out.println("\nPlease enter your guess, between " + lowerLimit + " and " + (upperLimit - 1));
			//guess = keyboard.nextInt();
			guess = Integer.parseInt(JOptionPane.showInputDialog(guessMsg));

			if (guess == answer) {
				//System.out.println("Congrats you win!");
				JOptionPane.showMessageDialog(null, "Congrats you win!");
				gameRunning = false;
			} else if (guess < answer) {
				//System.out.println("Sorry your guess is too low");
				JOptionPane.showMessageDialog(null, "Sorry, your guess is too low.");
			} else if (guess > answer) {
				//System.out.println("Sorry your guess is too high");
				JOptionPane.showMessageDialog(null, "Sorry, your guess is too high.");
			} else {
				//System.out.println("???");
				JOptionPane.showMessageDialog(null, "???");

			} // end while

			// Task, add conditionals for custom comments e.g win in 1 or 2 tries "guessed
			// in x tries" win in 3 or 4 tries, "guess in x tries"

			if (countLimit == 4 && gameRunning == false) {
				JOptionPane.showMessageDialog(null, "You're amazing! You guesssed it on your first try!");
				//System.out.println("You're amazing! You guessed it on your first try!");
			} else if (countLimit == 3 && gameRunning == false) {
				JOptionPane.showMessageDialog(null, "You did really good!");
				//System.out.println("You did really good!");
			} else if (countLimit == 2 && gameRunning == false) {
				JOptionPane.showMessageDialog(null, "You aren't very good at this, but you got it right eventually");
				//System.out.println("You aren't very good at this, but you got it right eventually");
			} else if (countLimit == 1 && gameRunning == false) {
				JOptionPane.showMessageDialog(null, "You barely made it! You suck at life!");
				//System.out.println("You barely made it! You suck at life!");
			} else if (countLimit == 0 && gameRunning == false) {
				JOptionPane.showMessageDialog(null, "You barely made it! You suck at life!");
				//System.out.println("You barely made it! You suck at life!");
			}
				
			
		} // end method
	}
} // end class