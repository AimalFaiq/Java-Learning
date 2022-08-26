package Abstract_Interface;



interface Aimal {
	void Test1 ();
	void Test2();
	void Test3();
	}
interface Sahil extends Aimal { // multi interface extentsion 
	void Test4();
	
}
class Faiq implements Sahil {
	public void Test1() {
	
	
		System.out.println("this is Test1 method");
	}
		public void Test2 () {
			System.out.println("this is Test2 method");
		}
		public void Test3 () {
			System.out.println("this is Test3 method");
		}
			public void Test4() {
				System.out.println("this is Test4 method");
			}
		}
	
	

public class Day21_Interface {

	public static void main(String[] args) {
		Faiq a = new Faiq ();
		a.Test1();
		a.Test2();
		a.Test3();
		a.Test4();

	}

}
