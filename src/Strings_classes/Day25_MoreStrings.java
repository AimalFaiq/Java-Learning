package Strings_classes;

public class Day25_MoreStrings {

	public static void main(String[] args) {
		//using replaceALL () method
		// it replaces or removes numbers , letters or special characters
String Home = "18646eri849hfs896e8&%*&%gjh@$";
String NoNumbers = Home.replaceAll("[0-9]", "");
// before using replaceAll numbers
System.out.println(Home);
//after using replaceALl numbers
System.out.println(NoNumbers);

String NoLowercase = Home.replaceAll("[a-z]", "");
System.out.println(NoLowercase);
String OnlySpecialCharacters = Home.replaceAll("[a-z0-9]", "");
System.out.println(OnlySpecialCharacters);
String ShowNumbersOnly = Home.replaceAll("[^0-9]", "");
System.out.println(ShowNumbersOnly);
	}

}
