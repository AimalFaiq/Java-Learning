package Strings_classes;

public class Day25_MoreStrings2 {

	public static void main(String[] args) {
		// using toCharArray () method
		String Name = "Hello World";
		char[] Characters = Name.toCharArray();
		System.out.println(Characters.length);

		for (int i = 0; i < Characters.length; i++) {
			System.out.println(Characters[i]);

		}
		// using split () method
		String Sentence = "My Name is Aimal Faiq";
		String[] Words = Sentence.split(" ");
		for (int i = 0; i < Words.length; i++) {
			System.out.println(Words[i]);

		}
		String Sentence2 = "My Name Is Aimal Faiq";
		char[] Character = Sentence2.toCharArray();
		for (int a = 0; a < Character.length; a++) {
			System.out.println(Character[a]);
		}
	}

}
