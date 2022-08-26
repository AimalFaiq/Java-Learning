package Arrays;

public class Day10_ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] salaries = { 200, 300, 500, 700, 900 };
		int sum = 0;
		for (int A = 0; A < salaries.length; A++) {
			sum = sum + salaries[A];
		}
		System.out.println("the sum is :" + sum);
		// 2 dimensional Array 
		
		int [][] BadgeNumbers = new int [2][3];
		BadgeNumbers [0][0] = 300;
		BadgeNumbers [0][1] = 400;
		BadgeNumbers [1][0] = 500;
		BadgeNumbers [1][1] = 600;
		BadgeNumbers [0][2] = 700;
		System.out.println(BadgeNumbers[0][0]);
		
		String [][] Cities = new String [2][3];
		Cities [0][0] = "Alexanderia";
		Cities [0][1] = "Springfield";
		Cities [1][0] = "Fairfax";
		Cities [1][1] = "Richmond";
		Cities [0][2] = "DC";
		System.out.println(Cities[0][2]);
		for (int rows = 0; rows < Cities.length; rows++) {
			for ( int column = 0; column < Cities [rows].length; column++) {
				System.out.println(Cities [rows][column]);
			}
		}
		
		String [][] Countries = {{ " Afghanistna","Pakistan", "India" }, {"Iran", "Tajekistan", "China"}
		};
		System.out.println(Countries [1][2]);
		
		int [][] serialnumber = {{ 20, 10, 50, 40 }, { 60, 70, 80, 90}};
		System.out.println(serialnumber [1][3]);
		
		}
	}


