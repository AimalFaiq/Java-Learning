package Abstract_Interface;

abstract class Shape {
	abstract void RectangleArea(double length, double width);
    abstract void SquareArea(double side);
    abstract void CircleArea(double r);

}

 class Area extends Shape {
	void  RectangleArea(double Length, double width) {
		double R = Length * width;
		System.out.println("the Area of Rectangle is :" + R + " m2 ");
	}

	void SquareArea(double side) {
		double S = side * side;
		System.out.println("the square Area is :" + S + "m2");
	}

	void CircleArea(double r) {
		double C = 2 * 3.14 * r;
		System.out.println("the Circle Area is :" + C + "m2");
	}
}

public class Day22_Task_Abstract {

	public static void  main(String[] args) {
		Area x = new Area();
		x.RectangleArea(12.5, 7.5);
		x.SquareArea(7.5);
		x.CircleArea(8.5);

	}

}
