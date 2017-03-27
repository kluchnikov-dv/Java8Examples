//Глава 8
//Доступ к членам класса и наследование
//стр. 212

class Box{
	double width;
	double height;
	double depth;
	
	
	Box (Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box (double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
}

class BoxWeight extends Box {
	double weigth;
	
	BoxWeight(double w, double h, double d, double m){
		width = w;
		height = h;
		depth = d;
		weigth = m;
	}
}

class ColorBox extends Box {
	String color;
	
	ColorBox(double w, double h, double d, String c){
		width = w;
		height = h;
		depth = d;
		color = c;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight myBox1 = new BoxWeight(12, 12, 43, 32.23);
		BoxWeight myBox2 = new BoxWeight(14, 22, 37, 62.23);
		
		System.out.println("Объем myBox1 = " + myBox1.volume());
		System.out.println("Масса myBox1 = " + myBox1.weigth);
		System.out.println("Объем myBox2 = " + myBox2.volume());
		System.out.println("Масса myBox2 = " + myBox2.weigth);
		
		ColorBox myColorBox = new ColorBox(32, 23, 54, "Red");
		System.out.println("Цвет myColorBox = " + myColorBox.color);
	}

}
