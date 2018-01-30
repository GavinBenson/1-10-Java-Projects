import java.util.Scanner;

public class Runner {
	
	// test out 10/8 want 1 remainder 2
	public static void main(String[] args) {
		/*** Testing integer division -- truncates! Does NOT round off! ***/
		/*** % modulus returns the remainder of a division **/
		/*
		int numberBits = 10;
		int bite = 8;
		int nibble = 4;
		int byteAnswer = 0, byteRemainder = 0;
	
		byteAnswer = numberBits/bite;
		byteRemainder = numberBits % bite;
		
		System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remainder = " + byteRemainder);
		*/
		/*** How to handle mixed case y, Y, yes, Yes, YES ....**/
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("\n\nHello, enter your answer (Y/N)");
		String answer = kbd.nextLine();
		System.out.println("You have entered: " + answer.toUpperCase());
		
		if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
			System.out.println("You have selected YES!");
		}
		else if(answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
			System.out.println("You have selected NO!");
		}
		else {
			System.out.println("Enter a valid answer.");
		}
	}
}