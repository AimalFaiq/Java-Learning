package This_Super_Keywords;

public class Day19_This_Keyword {
	int Rollnum;
	String Name;
	float fee;

	Day19_This_Keyword (int Rollnum){
		this ();
		System.out.println("i hate you" + Rollnum);
		
		
	}

	Day19_This_Keyword(int Rollnum, String Name, float fee) {
		this(5);

		this.Rollnum = Rollnum;
		this.Name = Name;
		this.fee = fee;
	}

	Day19_This_Keyword() {
		System.out.println("i love you");

		// this() can be used to invoke the current class constractor
	}

	void DisplayData() {
		System.out.println("Rollnum :" + Rollnum);
		System.out.println("Rollnum :" + Name);
		System.out.println("fee:" + fee);
	}
}
