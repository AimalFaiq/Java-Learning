package Tasks;
public class Day16_Student_Child extends Day16_Faculty_Parent{
     int Salary = 3000;
     
	public static void main(String[] args) {
		
		Day16_Student_Child Aimal = new Day16_Student_Child ();
		System.out.println(Aimal.Salary);
		System.out.println(Aimal.bonus);
		Aimal.hello();
	}

}
