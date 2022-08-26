package This_Super_Keywords;
class Cellphone {
	String Make = "Apple";
	String Color = "Blue";
	void Hello () {
		System.out.println("this method is in the parent class");
	}
}

class Smartphone extends Cellphone {
	String Make = "Samsung";
	String Color = "white";
	void Hello () {
		System.out.println("this method is in the child class");
	}

	void DisplayChildmake() {
		super.Hello();
		Hello();
		System.out.println("this phone is :" + Make);
		System.out.println("this phone is :" + Color);
	}

	void Displayparentmake() {
		System.out.println("this phone is :" + super.Make);
		System.out.println("this phone is :" + super.Color);

	}

}

public class Day19_Super_Keyword {

	public static void main(String[] args) {
		Smartphone a = new Smartphone ();
		a.DisplayChildmake();
		a.Displayparentmake();

	}

}
