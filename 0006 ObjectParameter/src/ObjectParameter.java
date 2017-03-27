//Глава 7
//Применение обьекта в качестве параметра
//стр.183 
//Применение объекта в конструкторе

class Box {
	double width;
	double height;
	double depth;
	
	//параллелепипед
	Box (double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	//куб
	Box(double length) {
		width = height = depth = length;
	}
	
	//пустой
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	//копируем обьект
	Box(Box object) {
		width = object.width;
		height = object.height;
		depth = object.depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}

public class ObjectParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box(10, 20, 15);
		Box b2 = new Box();
		Box cube = new Box(7);
		Box clone = new Box(b1);
		
		System.out.println("b1 = " + b1.volume());
		System.out.println("b2 = " + b2.volume());
		System.out.println("cube = " + cube.volume());
		System.out.println("clone b1 = " + clone.volume());
		
	}

}
