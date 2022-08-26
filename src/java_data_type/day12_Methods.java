package java_data_type;

public class day12_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Names ();
Name2 ("Aimal" , 41);
Name2 ("Ahmad" ,43);
String x = days ();
System.out.println(x);
int y = age ();
System.out.println(y);
String b = topic (" void and non void methods");
System.out.println(b);
	}
// void method without parameters
	public static void Names () {
		System.out.println("my name is Aimal");
		
	}
	// voif method with parameters
	public static void Name2 ( String name , int Age) {
		System.out.println( name + " is " + Age + " years old ");
	}
	// non void methods whithout parameters
	public static String days () {
		String todaysday = "Sunday";
		return todaysday;
		
	}
	
	public static int age () {
	int hisage = 25;
	return hisage;
	}
	// non void methods with parameters
	public static String topic ( String a) {
		return ("today we are learning"+a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
