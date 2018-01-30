package packag;

public class OneDimArrays {

	int[] myInts = { 5, 2, 8, 9, 12, 43 };
	String myStrings[] = { "Hello", "Happy", "Wednesday", "Period", "A2" };
	
	float[] myFloat = new float[5];
	double[] myDouble = new double[5];
	
	private void init_myFloat() {
		myFloat[0] = (float) 5.5;
		myFloat[1] = (float) 7.665;
		myFloat[2] = (float) 9.7;
		myFloat[3] = (float) 1.8;
		myFloat[4] = (float) 4.9;
	}
	
	private void init_myDouble() {
		myDouble[0] = 6.8;
		myDouble[1] = 7.4;
		myDouble[2] = 1.3;
		myDouble[3] = 7.3;
		myDouble[4] = 8.8;
	}
	
	public void sysoArray() {
		
		init_myFloat();
		init_myDouble();
		
		
		System.out.println("\nTraditional for loop\n");
		for (int i = 0; i < myInts.length; i++) {
			System.out.println(myInts[i]);
		}
		System.out.println("\nStarting enhanced for loop\n");
		for (int i : myInts) {
			System.out.println(i);
		}

		System.out.println("\nStarting string array test\n");
		for (int i = 0; i < myStrings.length; i++) {
			System.out.println(myStrings[i]);
		}

		System.out.println("\nStarting enhanced string array test\n");
		for (String i : myStrings) {
			System.out.println(i);
		}
		
		System.out.println("\nStarting float array test\n");
		for (int i = 0; i < myFloat.length; i++) {
			System.out.println(myFloat[i]);
		}
		
		System.out.println("\nStarting enhanced float array test\n");
		for (float i : myFloat) {
			System.out.println(i);
		}
		
		System.out.println("\nStarting double array test\n");
		for (int i = 0; i < myDouble.length; i++) {
			System.out.println(myDouble[i]);
		}
		
		System.out.println("\nStarting enhanced double array test\n");
		for (double i : myDouble) {
			System.out.println(i);
		}
	}

}
