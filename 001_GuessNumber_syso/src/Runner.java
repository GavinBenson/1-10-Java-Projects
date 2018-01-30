
public class Runner {

	public static void main(String[] args) {
		String welcome00 = "Hello1";
		String welcome01 = "Hello2";
		String welcome02 = "Hello3";
		
		//class	   instance name
		//don't repeat code
		CreateMsg welcome = new CreateMsg();
		welcome.msg(welcome00);
		welcome.msg(welcome01);
		welcome.msg(welcome02);
		
		// guessOne is called an instance creates instance
		GuessNumber guessOne = new GuessNumber();
		
		//goes inside that made instance
		//goes inside instance, then a method
		guessOne.startGame();
	}

}
