package While_DoWhile_loop;

import java.util.Scanner;

public class Day8_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner monthInput = new Scanner (System.in);
      for (int a =0; a < 3; a++) {
      System.out.println("Enter the month you were born in : ");
      String monthName = monthInput.next ();
      if (monthName.equals ("Jan") || monthName.equals ("Feb") || monthName.equals("Mar")) {
    	  System.out.println("Winter");
      } else if (monthName.equals("Apr") || monthName.equals("May") || monthName.equals("Jun")) {
    		System.out.println("Spring");  
    	  }  else if (monthName.equals("Jul") || monthName.equals("Aug") || monthName.equals("Sep")) {
      		System.out.println("Summer");
      } else if (monthName.equals("Oct") || monthName.equals("Nov") || monthName.equals("Dec")) {
      		System.out.println("Fall");
	} else {
    		  System.out.println("Invalid month");
    	  }
	}
      // days of the week
      for ( int b=0; b < 3; b++ ) {
      System.out.println("enter the day of the week you are at work");
      String DayName = monthInput.next ();
      if (DayName.equals("Sunday")){
    	System.out.println("weekend"); 
      } else if (DayName.equals("Monday")) {
    	  System.out.println("1st Workday");
      } else if (DayName.equals("Tuesday")) {
    	  System.out.println("2nd Workday");
      }  else if (DayName.equals("Wedensday")) {
    	  System.out.println("3rd Workday");
      } else if (DayName.equals("Thursday")) {
    	  System.out.println("4th Workday");
      } else if (DayName.equals("Friday")) {
    	  System.out.println("5th Workday");
      } else if (DayName.equals("Saturday")) {
    	  System.out.println("Weekend");
      }
}
}
}