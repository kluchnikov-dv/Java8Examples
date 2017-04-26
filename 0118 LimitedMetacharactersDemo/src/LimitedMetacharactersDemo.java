//Глава 14
//Ограниченные метасимволы в обобщенных типах
//стр. 412 -413

//класс из двух параметров
class TwoD {
	int x, y;
	
	TwoD(int a, int b) {
		x = a;
		y = b;
	}	
}

//класс из трех параметров
class ThreeD extends TwoD {
	int z;
	
	ThreeD(int a, int b, int c) {
		super(a, b);
		z = c;
	}
}

//класс из четырех параметров
class FourD extends ThreeD {
	int t;
	
	FourD(int a, int b, int c, int d) {
		super(a, b, c);
		t = d;
	}
}

//массив из координат с различным колличеством параемтров, ограниченных классом TwoD и его подклассами
class Coordinates <T extends TwoD> {
	T[] coordinates;
	
	Coordinates(T[] o) {
		coordinates = o;
	}
}



public class LimitedMetacharactersDemo {
	
	//Выводим все координаты класса Coordinates c любым допустимым параметром, в данном случае TwoD, ThreeD, FourD
	static void showTwoD(Coordinates<?> coord_array) {
		System.out.println("Значения координат X и Y:");
		for(int i = 0; i < coord_array.coordinates.length; i++) {
			System.out.println(coord_array.coordinates[i].x + " " + 
							   coord_array.coordinates[i].y);
		}
	}
	
	//Выводим все координаты класса Coordinates c любым допустимым параметром, ограниченным классом ThreeD и его подклассами
	static void showThreeD(Coordinates<? extends ThreeD> coord_array) {
		System.out.println("Значения координат X, Y, Z:");
		for(int i = 0; i < coord_array.coordinates.length; i++) {
			System.out.println(coord_array.coordinates[i].x + " " + 
							   coord_array.coordinates[i].y + " " + 
							   coord_array.coordinates[i].z);
		}
	}

	//Выводим все координаты класса Coordinates c любым допустимым параметром, ограниченным классом FourD и его подклассами
	static void showAll(Coordinates<? extends FourD> coord_array) {
		System.out.println("Значение координат X, Y, Z, T:");
		for(int i = 0; i < coord_array.coordinates.length; i++) {
			System.out.println(coord_array.coordinates[i].x + " " + 
							   coord_array.coordinates[i].y + " " + 
							   coord_array.coordinates[i].z + " " + 
							   coord_array.coordinates[i].t);
		}
	}
	
	static void showFourD(Coordinates<? super FourD> coord_array){
		System.out.println("Значение координат для суперкласса: ");
		for(int i = 0; i < coord_array.coordinates.length; i++) {
			System.out.println(coord_array.coordinates[i].x + " " + 
							   coord_array.coordinates[i].y);
							   //coord_array.coordinates[i].z   на это компилятор выругается
							   //сoord_array.coordinates[i].t
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//обьявляем массив координат для класса Coordinates
		TwoD[] tdv = {
				new TwoD(1, 2),
				new TwoD(3, 4),
				new TwoD(5, 6)
		};
		
		FourD[] fdv = {
				new FourD(12, 45, 34, 32),
				new FourD(-67, -23, -64, -77),
				new FourD(86, 34, 23, 43)
		};
		
		//Обьявляем и инициализируем класс с массивом координат
		Coordinates<TwoD> obj1 = new Coordinates<TwoD>(tdv); 
		Coordinates<FourD> obj2 = new Coordinates(fdv); //сократил запись
		
		showTwoD(obj1);
		//showThreeD(obj1); компилятор выдаст ошибку, т.к. ограниченный метасимвол может принадлежать классу ThreeD и его подклассам 
		//showFour(ob1); то же самое
		
		showTwoD(obj2);
		showThreeD(obj2);
		showAll(obj2);
		
		showFourD(obj2);
		showFourD(obj1);
		
		
	}

}