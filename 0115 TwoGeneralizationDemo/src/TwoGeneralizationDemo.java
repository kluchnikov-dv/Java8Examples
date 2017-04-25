//Глава 14
//Обобщенные классы с двумя параметрами типа
//стр. 403 - 404

//Простой обощенный класс с двумя параметрами
class TwoGeneralization<T, V> {
	T ob1;
	V ob2;
	
	//Передаем конструктору ссылки на обьекты типа T и V
	TwoGeneralization(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	//вывод типов T и V
	void showTypes() {
		System.out.println("Тип ob1: " + ob1.getClass().getName());
		System.out.println("Тип ob2: " + ob2.getClass().getName());
	}
	
	//получить значение обьекта ob1
	T getob1() {
		return ob1;
	}
	
	//получить значение обьекта ob2	
	V getob2() {
		return ob2;
	}
}



public class TwoGeneralizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGeneralization<Integer, String> obj1 = new TwoGeneralization<Integer, String>(88, "Второй обьект обобщенного типа. ");
		
		//Вывод типов обьектов ob1 и ob2
		obj1.showTypes();		
		//Вывод значений обьектов ob1 и ob2
		System.out.println("Значение ob1: " + obj1.getob1());
		System.out.println("Значение ob2: " + obj1.getob2());
		
		System.out.println("");
		
		//Можно и так
		TwoGeneralization<String, String> obj2 = new TwoGeneralization<String, String>("строка 1", "строка 2");
		obj2.showTypes();
		System.out.println("Значение ob1: " + obj2.getob1());
		System.out.println("Значение ob2: " + obj2.getob2());
	}

}
