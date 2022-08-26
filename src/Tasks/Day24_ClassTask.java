package Tasks;


public class Day24_ClassTask {

	public static void main(String[] args) {
	TaskOne ("Aimal");
    TaskTwo ("Ahmadsha");
    System.out.println(TaskThree ("Aimal" , "Faiq"));
    System.out.println(TaskThree ("Aimal" , "Aimal"));
	}
public static void TaskOne(String word) {
	int WorldLength = word.length();
	if (WorldLength >= 3) {
		if (WorldLength % 2 ==1) {
			int center = WorldLength / 2;
			System.out.println(word.substring(center , center +1));
		}
	}
	
	
}
public static void TaskTwo(String word) {
	int WorldLength = word.length();
	if (WorldLength >5) {
		if(WorldLength % 2==0) {
		int center = WorldLength /2;
		System.out.println(word.substring(center -1, center+1));
		}
	}
}
public static boolean TaskThree (String ValueOne, String ValueTwo) {
	return ValueOne.equals(ValueTwo);
}

}
