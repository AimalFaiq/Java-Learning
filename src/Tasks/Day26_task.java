package Tasks;

public class Day26_task {

	public static void main(String[] args) {
		// fiding the number of sentences
		String a = "Today is a good day . i am so happy . my name is Aimal";
		String[]Sen = a.split("\\.");
		System.out.println(Sen.length);
		// removing the spaces
System.out.println(NoSpaceSentence("my name is khan and i am not a terrorist"));

System.out.println(NumberOfCharacters("14463)*&&%$fjfgjf"));
	}
public static String NoSpaceSentence(String Sentence) {
	return Sentence.replaceAll(" ", "");
}// finding the number of special characters
public static int NumberOfCharacters(String Words) {
	String SpecialCharacters = Words.replaceAll("[a-z0-9]", "");
	int SpecialCharactersCount =SpecialCharacters.length();
	return SpecialCharactersCount;
}
}
