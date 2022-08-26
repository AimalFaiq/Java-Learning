package Scanner;

import java.util.Scanner;

public class Day5_Scanner {

	public static void main(String[] args) {
		// create object / instance of the class
		Scanner getInput = new Scanner(System.in);
		System.out.println(" enter the first value : ");
		int aa = getInput.nextInt(); 
		System.out.println("enter the second value : ");
	       int bb = getInput.nextInt();
	       int cc = aa + bb;
	       System.out.println("the sum is : " + cc);
	       
	       System.out.println(" enter the number 1");
	       int dd = getInput.nextInt ();
	       System.out.println("enter the number 2");
	       int ee = getInput.nextInt ();
	       int ff = dd + ee;
	       System.out.println("the total is " + ff);

	}

}
