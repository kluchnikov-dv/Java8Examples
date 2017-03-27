//Глава 8
//Применение переопределения методов
//стр.227 - 228 


class Figure {
	double dim1;
	double dim2;
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	double area() {
		System.out.println("Площадь фигуры не определена.");
		return 0;
	}
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Площадь прмоугольника.");
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Площадь треугольника.");
		return dim1 * dim2 / 2;
	}
}


public class DynamicSchedulingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(6, 3);
		Triangle t = new Triangle(13, 8);
		
		Figure figref;		
		
		figref = r;
		System.out.println(figref.area());
		
		figref = t;
		System.out.println(figref.area());
		
		figref = f;
		System.out.println(figref.area());
	}

}
