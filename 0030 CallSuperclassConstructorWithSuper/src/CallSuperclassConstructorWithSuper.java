//Глава 8
//Вызов конструкторов суперкласса с помощью ключевого слова super
//стр. 215

class Box {
	private double height;
	private double width;
	private double depth;
	
	//копирование обьекта
	Box(Box object) {
		height = object.height;
		width = object.width;
		depth = object.depth;
	}

	//инициализируем все переменные
	Box(double h, double w, double d) {
		height = h;
		width = w;
		depth = d;
	}

	//куб без размеров
	Box() {
		height = -1;
		width = -1;
		depth = -1;
	}

	//куб с равными сторонами
	Box(double len) {
		height = width = depth = len;
	}
	
	double volume() {
		return height * width * depth;
	}
}



class BoxWeight extends Box {
	double weigth;
	
	//копирование обьекта
	BoxWeight (BoxWeight object) {
		super(object);
		weigth = object.weigth;
	}
	
	//инициализация переменных
	BoxWeight(double h, double w, double d, double m) {
		super(h, w, d);
		weigth = m;
	}
	
	//куб без параметров
	BoxWeight(){
		super();
		weigth = -1;
	}
	
	//куб с равными сторонами + вес
	BoxWeight(double len, double m) {
		super(len);
		weigth = m;
	}
}


public class CallSuperclassConstructorWithSuper {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight myBoxWeight1 = new BoxWeight(12, 43, 12, 3.2);
		BoxWeight myBoxWeight2 = new BoxWeight(2, 3, 21, 4.2);
		BoxWeight myBoxWeight3 = new BoxWeight();
		BoxWeight myBoxWeight4 = new BoxWeight(3, 2);
		BoxWeight myBoxWeight5 = new BoxWeight(myBoxWeight1);
		
		System.out.print("Обьем myBoxWeight1 = " + myBoxWeight1.volume() + " Масса = " + myBoxWeight1.weigth + "\n");
		System.out.print("Обьем myBoxWeight2 = " + myBoxWeight2.volume() + " Масса = " + myBoxWeight2.weigth + "\n");
		System.out.print("Обьем myBoxWeight3 = " + myBoxWeight3.volume() + " Масса = " + myBoxWeight3.weigth + "\n");
		System.out.print("Обьем myBoxWeight4 = " + myBoxWeight4.volume() + " Масса = " + myBoxWeight4.weigth + "\n");
		System.out.print("Обьем myBoxWeight5 = " + myBoxWeight5.volume() + " Масса = " + myBoxWeight5.weigth + "\n");
		
		
	}

}
