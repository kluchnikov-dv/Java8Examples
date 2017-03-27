//Глава 7 
//Перегрузка конструкторов
//стр 180

class Box {
	double width;
	double height;
	double depth;
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;		
	}
	
	double volume() {
		return width * height * depth;
	}
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double lenght) {
		width = height = depth = lenght;
	}
}

public class OverloadConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(10, 20, 15);
		Box b2 = new Box();
		Box c = new Box(7);
		
		System.out.println("Объём b1 = " + b1.volume());
		System.out.println("Объём b2 = " + b2.volume());
		System.out.println("Объём с = " + c.volume());
	}
}
