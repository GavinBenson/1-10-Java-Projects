package arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StudentFirstNames {

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}
	
	public void menu() {
		Object[] selectionsArray = {"Show Names", "Check for a Name", "Add Name", "Remove Name", "Replace Name", "Exit"};
		String selection = (String) JOptionPane.showInputDialog(
				null, "Select a Utility: ", "", JOptionPane.PLAIN_MESSAGE, null,selectionsArray,"Show Names"
				);
		//if(selection == null) selection = "Cancelled";
		
		switch (selection) {
		case "Show Names":
			showContents();
			menu();
		break;
		case "Check for a Name":
			checkName();
			menu();
		break;
		case "Add Name":
			addName();
			menu();
		break;
		case "Remove Name":
			deleteName();
			menu();
		break;
		case "Replace Name":
			replaceName();
			menu();
		break;
		case "Exit":
			System.exit(0);
		break;
		default:
			System.exit(0);
		}
	}

	public void showContents() {
		JOptionPane.showMessageDialog(null, "The array list contains");
		for (int i = 0; i<a2Students.size(); i++) {
			JOptionPane.showMessageDialog(null, a2Students.get(i) + a2Students.get(i + 1));
		}
	}
	
	public void addName() {
		String n = JOptionPane.showInputDialog("What name would you like to add?");
		
		if (a2Students.indexOf(n) < 0) {
			a2Students.add(n);
		}
		else {
			JOptionPane.showMessageDialog(null, "Name already exists.");
		}
		
	}
	
	public void replaceName() {
		String n = JOptionPane.showInputDialog("Whos name would you like to replace?");
		String rn = JOptionPane.showInputDialog("What would you like to replace their name with?");
		if (a2Students.indexOf(n) > 0) {
			a2Students.set(a2Students.indexOf(n), rn);
		}
		else {
			JOptionPane.showMessageDialog(null, "That name doesn't exist!");
		}
	}
	
	public void deleteName() {
		String n = JOptionPane.showInputDialog("What name would you like to delete?");
		
		if (a2Students.indexOf(n) > 0) {
			a2Students.remove(n);
		}
		else {
			JOptionPane.showMessageDialog(null, "Name doesn't exist!");
		}
	}
	
	public void checkName() {
		String n = JOptionPane.showInputDialog("Who would you like to search for?");
		if (a2Students.indexOf(n) == -1)
			JOptionPane.showMessageDialog(null, "Sorry, name not found.");
		else
			JOptionPane.showMessageDialog(null, "Name found! The index of that name is " + a2Students.indexOf(n));
	}

	public void showSize() {
		JOptionPane.showMessageDialog(null, "Number of student names is " + a2Students.size());
	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}