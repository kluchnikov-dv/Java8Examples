//Глава 8
//Переменная суперкаласса может ссылаться на обьект подкласса
//стр. 213-214

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

public class VariableSuperclassReferenceToObjectSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BoxWeight weightbox = new BoxWeight(12, 15, 62, 34.212);
			Box standartbox = new Box();
			System.out.println("Обьем weightbox = " + weightbox.volume());
			//присваиваем переменной standartbox ссылку на обьект подкласса standartbox
			standartbox = weightbox;
			System.out.println("Обьем standartbox = " + standartbox.volume() + " (такой же)");
			//а вот сослаться на парметр weight - масса не получится, т.к. standart яв-ся обьектом типа Box
			//System.out.println("Масса standartbox = " + standartbox.weight);
	}

}
