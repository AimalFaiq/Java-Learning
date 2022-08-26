package Abstract_Interface;
abstract class Flowers {
	abstract void Rose();

	abstract void Tulip();

	abstract void Lily();

}

abstract class Colors extends Flowers {
	void Rose() {
		System.out.println("this is a Rose Method");

	}

	void Tulip() {
		System.out.println("this is a Tulip Method");
	}

	abstract void Smell();

}

class Garden extends Colors {
	void Smell() {
		System.out.println("this is Smell Method");
	}
void Lily() {
	System.out.println("this is Lily Method");
}
}

public class Day20_Abstract_Task {

	public static void main(String[] args) {
       Colors b = new Garden ();
		Garden c = new Garden();
		c.Rose();
		c.Tulip();
		c.Lily();
		c.Smell();

	}

}
