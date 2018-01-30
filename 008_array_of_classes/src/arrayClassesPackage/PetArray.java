package arrayClassesPackage;

import javax.swing.JOptionPane;

public class PetArray {
	
	Pet[] myPets = new Pet[3];

	public void buildArray() {
		
		myPets[0] = new Pet();
		String bree = JOptionPane.showInputDialog(null, "What is the breed?");
		String gende = JOptionPane.showInputDialog(null, "What is the gender?");
		int ag = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the age?"));
		String symptom = JOptionPane.showInputDialog(null, "What are the symptoms?");
		
		myPets[0].setBreed(bree);
		myPets[0].setGender(gende);
		myPets[0].setAge(ag);
		myPets[0].setSymptoms(symptom);
		
		
	}

	public void showArray() {
		
		for (int s = 0; s < myPets.length; s++) {
			System.out.println("Breed Is: " + myPets[s].getBreed());
			System.out.println("Gender Is: " + myPets[s].getGender());
			System.out.println("Age is: " + myPets[s].getAge());
			System.out.println("Symptoms are: " + myPets[s].getSymptoms());
		}
		
		
		
		
	}

	

}