package array_fun;

public class TheMainClass {

	public static void main(String[] args) {
		
		ArrayFun learnArrays = new ArrayFun();
		
		learnArrays.showInstructions();
		learnArrays.intArrayExample();

		
		Matrix my2D = new Matrix();
		my2D.gameBoardTest();
		
		Matrix ticTac = new Matrix();
		ticTac.gameBoard();
	}

}