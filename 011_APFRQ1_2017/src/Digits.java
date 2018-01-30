import java.util.ArrayList;
import java.util.Collections;

public class Digits {

	private ArrayList<Integer> digitList;
	
	public Digits(int num) {
		System.out.println(num);
		int myDigit = num % 10;
		System.out.println("one of the digits is this: " + myDigit);
		int nextNum = num/10;
		System.out.println("the next num is: " + nextNum);
		
		int x = 10;
		while(x/10 <= num) {
			myDigit = (num%x)/(x/10);
			x*=10;
			System.out.println(myDigit);
		}
		digitList = new ArrayList<Integer>();
		//digiList.add(myDigit;
		
		while(num>0) {
			int answer = num%10;
			num= num/10;
			digitList.add(0,answer);
		}
		
		//Collections.reverse(digitList);
		System.out.println(digitList);
	}

	public boolean isStrictlyIncreasing() {
		for (int i = 0; i < digitList.size() - 1; i++) {
			if (digitList.get(i) >= digitList.get(i + 1)) {
				return false;
			}
		}
		return true;
	}
}
