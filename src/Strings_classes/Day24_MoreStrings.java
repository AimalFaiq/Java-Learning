package Strings_classes;

public class Day24_MoreStrings {

	public static void main(String[] args) {
		// using Concat () Method
		String Fname = "Aimal";
		String Lname = "Faiq";
		String FullName = Fname.concat(Lname);
		System.out.println(FullName);

		//Using Trim () Method
		//we use the Trim method to remove the extra spaces from one sentence in order to match it with another
		String Day = ("  Today is Tuseday   ");
		Day = Day.trim();
		if (Day.equals("Today is Tuseday") ) {
		System.out.println("yayy the string value matched");
	}
	else {
		System.out.println("the value does not match");
	}
	
		String Transaction = "$50.00";
		boolean Dollarsymbol = Transaction.startsWith("$");
		if (Dollarsymbol) {
			System.out.println("the prefix is present");
			}
		else {
			System.out.println("the prefix is not present");
		}
		boolean Tuseday = Day.endsWith("Tuseday");
		System.out.println(Tuseday);
		// using charAt () method
		// we use charAT method to find out which letter or number is on that specific spot we put on charAT
		char ret = Transaction.charAt(1);
		System.out.println(ret);
		//using indexOf () method
		// we use indexOf method to locate the location of that specific letter or number in a sentence 
		System.out.println(Transaction.indexOf('5'));
		String email = "Aimal123@gmail.com";
		System.out.println(email.indexOf('@'));
		// using substring () method
		// in this method you put the number of index of a sentence and it print starting that letter and the rest of the sentence
		System.out.println(email.substring(8));
		// using substring () method which takes 2 arguments
		System.out.println(email.substring(0, 8));
		// using replace () methid
		String Aim = "my name is Aim@l";
		System.out.println(Aim);
		Aim = Aim.replace("@" ,"a");
		System.out.println(Aim);
		
	}
	}


