package Variables;

public class Day15_StaticVariable {
	String phone = "iphone";
	String color = "Black";
	static int Memory = 32; 
	
	public static void main(String[] args) {
		//static variable
		Day15_StaticVariable Aimalphone = new Day15_StaticVariable ();
		System.out.println(Aimalphone.phone);
		System.out.println(Aimalphone.color);
		System.out.println(Aimalphone.Memory);


	

		Day15_StaticVariable Jawidphone = new Day15_StaticVariable ();
		Jawidphone.Memory = 64;
		System.out.println(Jawidphone.Memory);
		System.out.println( Aimalphone.Memory);
		
		
	}	
		
	}
// when you change avalue in static variable it affects the original value