import java.util.Scanner;

public class Task {
	

	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		for ( int e = 0; e <5; e++) {
		System.out.println(" enter the first value : ");
		int a = getInput.nextInt(); 
		System.out.println("enter the second value : ");
	       int b = getInput.nextInt();
	       System.out.println("enter the second value : ");
	       int c = getInput.nextInt();
	       int d = a + b+ c;
	       System.out.println("the sum is : " + d);
	       
		}      

	}

}
