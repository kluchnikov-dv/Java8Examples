//Глава 14
//Простой пример обобщения
//стр. 396-397


//Просто обобщенный класс.
//Здесь T означает параметр типа, который будет заменен реальным типом,
//при создании олбьекта Generalization.
class Generalization<T> {
	//обьявить обьект типа Т
	private T ob; 
	
	//передать конструктору ссылку на обьект типа T
	Generalization(T o) { 
		ob = o;
	}
	
	T getOb() {
		return ob;
	}
	//показтиь тип T
	void showType() {
		System.out.println("Тип T переменной ob: " + ob.getClass().getName());
	}
}

//Продемонстрировать применение обобщенного класса
public class GeneralizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Создать ссылку типа Generalization для целых чисел
		Generalization<Integer> obj1;
		//создать обьект Generalization и присвоить ссылку на него переменной obj1, 
		//присваивая значение по-средством конструктора
		obj1 = new Generalization<Integer>(88);
		//выводим тип данных, хранящемся в переменной ob
		obj1.showType();
		//Выводим значение
		int i = obj1.getOb();
		System.out.println("Значение переменной i: " + i);
		System.out.println("");
		
		//Создать ссылку типа Generalization для строкового типа
		Generalization<String> obj2;
		//Создать обьект Generalization и присвоить ссылку на него переменной obj2,
		//присваивая значение по средством конструктора
		obj2 = new Generalization<String>("Пример обобщения.");
		//выводим типа данных, хранящимся в переменной ob
		obj2.showType();
		//выводим значение 
		String str = obj2.getOb();
		System.out.println("Значение переменной str: " + str);
		
	}

}
