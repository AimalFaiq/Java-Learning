package Constructor;
public class Day16_ConstructorExample {

	public static void main(String[] args) {
		
		Day16_Constructor Cons = new Day16_Constructor ();
		Day16_Constructor para_Cons = new Day16_Constructor ("Aimal");
		Day16_Constructor para_double_Cons = new Day16_Constructor ( "john" , "Faiq");
	para_Cons.hello();
	// if the method is static below is how you suppose to call it
	//Day16_Constructor.hello();
	}

}
