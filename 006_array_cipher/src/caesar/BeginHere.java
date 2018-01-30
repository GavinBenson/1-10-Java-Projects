package caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {

		
		menu();
		
		int createOption = 1; // 0 = yes, 1 = no from showConfirmDialog
		
		createOption = JOptionPane.showConfirmDialog(null, "Would you like to use my cipher utility again?",
				"Cipher Utility"
				, JOptionPane.YES_NO_OPTION);
		
		if (createOption == 0) {
			menu();
		}
		else {
		}
		
	}
	
	public static void menu() {
		CaesarCipher myCipher = new CaesarCipher();
		Object[] selectionsArray = { "Encoder", "Decoder", "Cracker", "Exit" };
		String showFirst = "Encoder";
		String selection = (String) JOptionPane.showInputDialog(
				null, 
				"Message: Select a Utility: ",
				"Cipher Utility", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				selectionsArray, 
				showFirst);
		if (selection == null) selection = "Cancelled";// .equals doesn't work, null is not a String
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);
		
		switch (selection) { // switch on String allowed in Java 7 and higher
		case "Encoder":
			String plainText = JOptionPane.showInputDialog("Please enter plain text to encode").toLowerCase();
			JOptionPane.showMessageDialog(null, "You have entered this for plain text: " + plainText);
			
			int key = Integer.parseInt(JOptionPane.showInputDialog("Please enter the key: "));
			
			String codedText = myCipher.encode(plainText, key);
			JOptionPane.showMessageDialog(null, "Your secret message is: " + codedText);
			
			break;
		case "Decoder":
			
			String plainText1 = JOptionPane.showInputDialog("Please enter coded text to decode").toLowerCase();
			JOptionPane.showMessageDialog(null, "You have entered this coded text: " + plainText1);
			
			int key1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the key: "));
			
			String codedText1 = myCipher.decode(plainText1, key1);
			JOptionPane.showMessageDialog(null, "Your decode message: " + codedText1);
			
			break;
		case "Cracker":
			String plainText2 = JOptionPane.showInputDialog("Please enter coded text to crack").toLowerCase();
			JOptionPane.showMessageDialog(null, "You have entered this for coded text: " + plainText2);
			String[] codedtextlist = new String[26];
			for (int i = 0; i < 26; i++) {
				int key2;
				String codedText2 = "";
				key2 = i;
				codedText2 = codedText2 + myCipher.encode(plainText2, key2);
				codedtextlist[i] = myCipher.encode(plainText2, key2);
				
				
			}
			JOptionPane.showMessageDialog(null, "Your secret message is: " + codedtextlist[0]+" "+codedtextlist[1]+" "+
			codedtextlist[2]+" "+codedtextlist[3]+" "+codedtextlist[4]+" "+codedtextlist[5]+" "+codedtextlist[6]+" "+codedtextlist[7]
			+" "+codedtextlist[8]+" "+codedtextlist[9]+" "+codedtextlist[10]+" "+codedtextlist[11]+" "+codedtextlist[12]+" "+
			codedtextlist[13]+" "+codedtextlist[14]+" "+codedtextlist[15]+" "+codedtextlist[16]+" "+codedtextlist[17]+" "+codedtextlist[18]
			+" "+codedtextlist[19]+" "+codedtextlist[20]+" "+codedtextlist[21]+" "+codedtextlist[22]+" "+codedtextlist[23]+" "+
			codedtextlist[24]+" "+codedtextlist[25]
					);
			
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null, 
				"Thanks for using my utility!");
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, 
				"Thanks for using my utility!");
			System.exit(0);
			break;
		}
	}

}