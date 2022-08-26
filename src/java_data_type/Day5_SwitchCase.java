package java_data_type;

public class Day5_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Day = "Sunday";
		switch (Day) {
		case "Sunday":
			System.out.println("first day of the week");
			break;
		case "Monday":
			System.out.println("Second day of the week");
		case "Tuesday":
			System.out.println("thrid day of the week");
			default:
				System.out.println("invalid day entered");
		}
		// end of program
		int Age = 50;
		switch (Age) {
		case 40: 
			System.out.println(" the Age is 40");
			break;
		case 30:
			System.out.println("the Age is 30");
			break;
		case 20:
			System.out.println("the Age is 20");
			break;
			default:
				System.out.println("invalid Age entered");
		}
	
		  
	  }
		

}
