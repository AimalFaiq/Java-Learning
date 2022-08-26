package Method_Overridding_Overloading;

public class Day18_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition(10 ,20);
		Addition (5 ,5 ,5);
		Addition ( "Aimal :" , "Faiq");
		Addition (5 , 5.54f);
	}
		
	
	
	static void Addition ( int a, int b) {
		System.out.println(a + b);
			
		}
	
	static void Addition (int a , int b ,int c) {
		System.out.println(a + b + c);
		
	}
	static void Addition ( String a ,String b) {
		System.out.println(a + b);
	}
	static void Addition ( int a ,float b) {
		System.out.println(a + b);

	}
}

