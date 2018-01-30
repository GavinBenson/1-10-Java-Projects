Notes from runner -
		 * 1. Start with the exact class name (HelloWorld.java)
		 * 2. give that "instance" of that class a unique name, in you have a bunch of instances of that class
		 * 3. First instance, so say "new"
		 * 4. give the constructor name (HelloWorld()), but later we will add parameters into the parens (like player names, difficulty)
		 
Notes from CreateMsg -
 //Started with greetings but why limit ourselves? We want to send a msg. make our classes "abstract"
	// trucks, f150, f250, f350, dont make a class for each.
	//make it abstract, or general. ie "Trucks" the within you coudl make F150, f250, f350 etc
	
	// Make a constructor -- a constructor initializes a class
	// that means what is my initial setup for this class
	
	//to make a constructor
	//1. public -- so other classes can access it
	//2. exact same name as the class
	//3. () if you want to pass any info in
	//4. { code goes here }
	
Notes from guessnumber -
//vocab - Encapsulation means keep all related code in a single class, do not spread things out all over the place
	//spaghetti code
	
	//field variables, put all your vars up top
	//constructors, you can have more than one constructor that would be called a constructor stack
	//constructor has same name as class
	
	//4 types of loops:
	//for loop if you know how many times to loop
	//while loop if you don't know how many times to loop
	//do-while loop
	//enhanced for loop for arrays
	
Inclusive for the first number,
exclusive for the second number to avoid overlapping numbers
when you stack these; ex:

0-10, 10-20, 20-30 is a possible stack; you don't want duplicate at 10 and 20

for (int i=0; i <= 100; i++) {
			System.out.println(i + ", rand = " 
			+ (rand.nextInt(upperLimit) + lowerLimit));
		}