package Abstract_Interface;

abstract class Furniture {
	abstract void Color();

	abstract void Material();

	abstract void Weight();

}

abstract class Chair extends Furniture {
	void Color() {
		System.out.println("this is a color method");

	}

	void Material() {
		System.out.println("this is a Material method");
	}

	abstract void Dimention();
}

class Brand extends Chair {
	void Dimention() {
		System.out.println("this is a Dimention method");

	}

	void Weight() {
		System.out.println("this is a weight method");
	}
}

public class Day20_Abstract {

	public static void main(String[] args) {
		// indirect object
		Chair a = new Brand ();
		a.Color();
		// direct object
		Brand B = new Brand();
		B.Color();
		B.Weight();
		B.Dimention();
		B.Material();

	}
}
