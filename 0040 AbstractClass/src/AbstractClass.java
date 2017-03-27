//Глава 8
//Абстрактные классы пример доработанного класса
//стр. 230-231

abstract class Figure {
	double dim1;
	double dim2;
	
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	abstract double area();
}

class Rectangle extends Figure {
	
	Rectangle(double a, double b) {
		super(a, b);
	}
	
	double area() {		
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	
	Triangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		return dim1 * dim2 / 2;
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure FigureRef;
		Rectangle rectangle = new Rectangle(10, 5);
		Triangle triangle = new Triangle(3, 5);
		
		FigureRef = rectangle;
		System.out.println("Площадь прямоугольника: " + FigureRef.area());
		
		FigureRef = triangle;
		System.out.println("Площадь треугольника: " + FigureRef.area());
	}
}
