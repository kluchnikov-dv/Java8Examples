//Глава 8
//Создание многоуровневой иерархии
//стр. 219 - 221

class Box {
	private double width;
	private double height;
	private double depth;
	
	//копируем обьект
	Box(Box object) {
		width = object.width;
		height = object.height;
		depth = object.depth;
	}
	
	//создаем новый обьект с переменными
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	//инициализируем пустой
	Box() {
		width = height = depth = -1; 
	}
	
	//создаем обьект с равными сторонами
	
	Box(double len) {
		width = height = depth = len;
	}
	
	//считаем обьем
	double volume() {
		return width * height * depth;
	}
	
}

class WeightBox extends Box {
	double weight;
	
	//копируем обьект
	WeightBox(WeightBox object) {
		super(object);
		weight = object.weight;
	}
	
	//создаем новый обьект с переменными
	WeightBox(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;		
	}
	
	//инициализируем пустой
	WeightBox() {
		super();
		weight = -1;
	}
	
	//создаем обьект с равными сторонами
	WeightBox(double len, double m) {
		super(len);
		weight = m;
	}
}

//класс посылка, добавляем стоимость
class Shipment extends WeightBox {
	double cost; //стоимость
	
	//копируем обьект
	Shipment(Shipment object) {
		super(object);
		cost = object.cost;
	}
	
	//создаем новый обьект
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}
	
	//инициализируем пустой
	Shipment() {
		super();
		cost = -1;
	}
	
	//создаем обьект с равными сторонами
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}


public class MultilevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shipment shipment1 = new Shipment(1, 2, 3, 12.1, 43.1);
		Shipment shipment2 = new Shipment(2, 6, 5, 20.1, 83.3);
		
		System.out.println("Обьем shipment1 = " + shipment1.volume() + "вес = " + shipment1.weight + "цена = " + shipment1.cost);
		System.out.println("Обьем shipment2 = " + shipment2.volume() + "вес = " + shipment2.weight + "цена = " + shipment2.cost);
		
	}

}
