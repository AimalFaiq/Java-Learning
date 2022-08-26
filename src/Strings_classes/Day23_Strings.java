package Strings_classes;

public class Day23_Strings {

	public static void main(String[] args) {
		String Topic = new String ("I love you");
		int Len = Topic.length();
		System.out.println(Len);
		//using touppercase method
		System.out.println(Topic.toUpperCase());
		
		
		String Name = "AIMAL";
		String Lastname = "AIMAL";
		String FirstName = Name.toLowerCase();
		// another way of using length method
		System.out.println("this will print the length of Name : "+ Name.length());
		System.out.println("this will print the name variableb:"+ Name);
		// using the tolowercase method
		System.out.println("this will print the name variable in lower case :" +Name.toLowerCase());
		//using equalsignorecase method
		System.out.println("using equalsignorecae : " + Name.equalsIgnoreCase(Lastname));
		//using equals method
		System.out.println("using equals : " + Name.equals(Lastname));
		//using compareTo method
		System.out.println("using equals : " + Name.compareTo(Lastname));
		// using CompareToIgnoreCase method
		System.out.println("using equals : " + Name.compareToIgnoreCase(Lastname));

	}

}
