package While_DoWhile_loop;

import java.util.Scanner;

public class day11_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values do you need to do a sum for : ");
		int values = getInput.nextInt();
		
		int [] arr = new int [values];
		int sum =0;
		for (int i=0; i< arr.length; i++) {
			System.out.println("enter the " +(i+1) + "value : ");
			arr[i] = getInput.nextInt();
			sum  = sum + arr[i];
		}
		System.out.println("the sum of "+ arr.length + "valuse is " +sum );
	}

}
