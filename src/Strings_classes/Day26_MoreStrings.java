package Strings_classes;

public class Day26_MoreStrings {
// using StringBuffer and append () 
	// we can connect two words using append () method in StringBuffer.
	public static void main(String[] args) {
		String a = "Hello";
		String b = a + " World";
		System.out.println(b);

		
		StringBuffer aa = new StringBuffer("Hello");
		
		aa.append(" World");
		System.out.println(aa);
		aa.append(" " +"tonight is a good night");
		System.out.println(aa);
		// using insert () method
		//we can add to our sentence using insert() method
		aa.insert(12, "yout know ");
		System.out.println(aa);
		aa.insert(0, "Hey. ");
		System.out.println(aa);
		aa.insert(50, '.');
		System.out.println(aa);
		// using reverse () method
		aa.reverse();
		System.out.println(aa);
		aa.reverse();
		// using delete () method
		aa.delete(10, 16);
		System.out.println(aa);
		aa.delete(14, 15);
		System.out.println(aa);
		// using deleteCharAt () to delete 1 specific character
		aa.deleteCharAt(5);
		System.out.println(aa);
		// Using replace () method to replace words or characters
		aa.replace(0, 3, "Hi");
		System.out.println(aa);
		aa.insert(4, "H");
		System.out.println(aa);
		
		
		
		
		
		
		
		
		
	}

}
