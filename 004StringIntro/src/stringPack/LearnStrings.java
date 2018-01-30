package stringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	private String word = "";

	public LearnStrings(String s) {
		setString(s);
	} // end of constructor

	public void setString(String s) {
		word = s;
		String msg = "String entered is: " + word;
		JOptionPane.showMessageDialog(null, msg);
	} // end of method setString

	public char getFirstLetter() {
		return word.charAt(0);
	} // end of method getFirstLetter
	
	public int getLength() {
		return word.length();
	} // end of method getLength
	
	public char getLastLetter() {
		return word.charAt(word.length()-1);
	} // end of method getLastLetter
	
	public String getMSubString() {
		return word.substring(1, word.length()-1);
	} // end of method getSubString
	//setters/modifiers/mutators purpose to set vars in a controlled way.
	//getter/accessor purpose to retrieve vars in a controlled way.
	//asdfasdf
} // end of class LearnStrings