package While_DoWhile_loop;

public class Day7_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Before the loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println("hello world");

		}
		System.out.println("after the loop");

		for (int i = 10; i >= 0; i--) {

			System.out.println(i);
		}
		for (int A = 0; A <= 100; A = A + 2) {
			System.out.println(A);
		}
		// in order to get the even numbers from 20 to 50
		for (int A = 20; A <= 50; A++) {
			if (A % 2 == 0) {
				System.out.println(A);
			}
		}
		
       for (int B = 20; B <= 50; B++) {
    	   if (B % 2 ==1) {
    		   System.out.println(B);
    	   }   
       }
       for ( int q =1; q < 40; q++) {
    	   if ( q % 2 ==0) {
    	   System.out.println(q);
       }
		}
	}
}
	

