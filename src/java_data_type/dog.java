package java_data_type;

public class dog {
	String breed;
	String size;
	String color;
int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 dog dog1 = new dog();
 dog1.breed = "German Shepherd";
 dog1.size = "medium";
 dog1.color = " black";
 dog1.age = 4;
 
 dog dog2 = new dog ();
 dog2.breed = "huskey";
 dog2.size = "small";
 dog2.color = "white";
 dog2.age = 3;
 
 System.out.println(dog1.breed +' '+ dog1.size +' '+ dog1.age + dog1.color);
 Aimal();
	}
 public static void Aimal () {
	 System.out.println("hello");
	 
	 String day = ("tuesday");
	 switch (day) {
	 case "tuesday":
	 System.out.println("first day of the week");
	 break;
	 case "wedensday":
		 System.out.println("second day of the week");
		 break;
	default:
		System.out.println("you have entered an invalid day");
	 
	 
	 
	 
	 }
 }
}
