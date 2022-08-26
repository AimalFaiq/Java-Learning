package Arrays;

public class Day09_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] Salaries = new int[6];
		Salaries[0] = 3000;
		Salaries[1] = 4000;
		Salaries[2] = 5000;
		Salaries[3] = 6000;
		Salaries[4] = 7000;
		Salaries[5] = 8000;
		System.out.println(Salaries[4]);

		String[] FirstNames = new String[5];
		FirstNames[0] = "Aimal";
		FirstNames[1] = "Anya";
		FirstNames[2] = "Ashiyana";
		FirstNames[3] = "Ali";
		FirstNames[4] = "Ayeda";
		System.out.println(FirstNames[3]);

		String[] Pets = { "Cat", "Dog", "Rabbit", "Bird", "Monkey" };
		System.out.println(Pets[4]);
		System.out.println(Pets.length);
		for (int A = 0; A < 5; A++) {
			System.out.println(Pets[A]);
		}
        int [] badges = new int [4];
        badges [0]= 10;
        badges [1]= 20;
        badges [2]= 30;
        badges [3]= 40;
        System.out.println(badges.length);
        for ( int d = 0; d < 4; d++ ) {
        	System.out.println(badges [d]);
        }
	}
}