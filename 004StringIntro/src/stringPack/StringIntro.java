package stringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {

		// var fie
		String msg = "";
		String endLoop = "";
		Boolean loopCondition = true;

		JOptionPane.showMessageDialog(null, "Welcome to my program");
		while (loopCondition == true) {

			// asks user for input then displays first char of that string
			LearnStrings getIt = new LearnStrings(JOptionPane.showInputDialog("Please enter a word!"));
			msg = "First character is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);

			// grabs last letter of string
			char lastLetter = getIt.getLastLetter();
			msg = "Last letter is: " + lastLetter;
			JOptionPane.showMessageDialog(null, msg);

			// grabs length of string
			//asdf
			
			int stringLength = getIt.getLength();
			msg = "Length of string is: " + stringLength;
			JOptionPane.showMessageDialog(null, msg);

			// grabs substring excluding first and last char in string
			String mSubString = getIt.getMSubString();
			msg = "Sub string is: " + mSubString;
			JOptionPane.showMessageDialog(null, msg);
			

			// tests for end of loop
			endLoop = JOptionPane.showInputDialog("Would you like to enter another word (y/n)?");
			if (endLoop.equalsIgnoreCase("y"))
				loopCondition = true;
			else if (endLoop.equalsIgnoreCase("yes")) 
				loopCondition = true;
			else if (endLoop.equalsIgnoreCase("n")) {
				JOptionPane.showMessageDialog(null, "Thanks for using my program!");
				loopCondition = false;
			}
			else if (endLoop.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Thanks for using my program!");
				loopCondition = false;
			}
			else {
				JOptionPane.showMessageDialog(null, "Because you clearly can't follow instructions, i'll just assume you meant no.");
				loopCondition = false;
			}// end loop testing
			
		} // end while loop
	} // end main constructor
} // end class StringIntro