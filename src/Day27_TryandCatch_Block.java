import java.util.Scanner;

public class Day27_TryandCatch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the value for a");
		int a = sc.nextInt();
		System.out.println("the value of a is :" + a);
		System.out.println("enter the value of b");
		int b = sc.nextInt();
		System.out.println("the value of b is :" + b);
		try {
			int c = a / b;
			System.out.println("the division is c :" + c);

		} catch (Exception d) {
			d.printStackTrace();
			System.out.println("the program ended");

		}
	}

}
