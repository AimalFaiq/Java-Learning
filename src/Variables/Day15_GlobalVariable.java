package Variables;

public class Day15_GlobalVariable {
// instance / Global Variable
	
	String phone = "iphone";
	String color = "Black";
	public static void main(String[] args) {
		Day15_GlobalVariable Aimalphone = new Day15_GlobalVariable ();
		System.out.println(Aimalphone.phone);
		System.out.println(Aimalphone.color);
		
		Day15_GlobalVariable Faiqphone = new Day15_GlobalVariable ();
		Faiqphone.phone = "Galaxy7";
		Faiqphone.color = "white";
		System.out.println(Faiqphone.phone);
		Day15_GlobalVariable sahilphone = new Day15_GlobalVariable ();
		sahilphone.possible();

	}

	public static void possible () {
		Day15_GlobalVariable sahilphone = new Day15_GlobalVariable ();
		sahilphone.phone = "Android";
		sahilphone.color = " Red";
		System.out.println(sahilphone.phone);
		System.out.println(sahilphone.color);
		
	}
}
