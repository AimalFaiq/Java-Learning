package Scanner;

import java.util.Scanner;

public class Day6_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		System.out.println(" Enter the int Value :");
		int val1 = getInput.nextInt();
		System.out.println("enter the second value :");
		int val2 = getInput.nextInt();
		int val3 = val1 + val2;
		System.out.println("the add is : " + val3);
		// boolean practice
		System.out.println("are you studying hard?");
		Boolean val4 =  getInput.nextBoolean();
		System.out.println("if you study hard you will pass , if you dont study you fail :"+ val4);
		
	}

}
