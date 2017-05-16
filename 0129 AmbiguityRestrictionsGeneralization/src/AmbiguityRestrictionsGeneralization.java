//Глава 14
//Ошибки неоднозначности Ограничения
//стр. 433 - 436

//Обобщённый класс не может расширять класс Throwable


//Про ошибку неоднозначности
class MyClass<T, V> {
	T obj1;
	V obj2;
	
	//Эти два перегружаемых метода неоднозначны и не компилируются
	//1. Можно обьявить так MyClass<String, String> strobj = new MyClass<String, String>();
	//   В этом случае оба метода set оказываются одинаковыми
	//2. Фундаментальная ошибка в том, что стирание методов приводит методы set к виду
	//   void set(Object o) { //
	//3. Можно исправить class MyClass<T, V extends Numbers> {//почти верно
	//	 Но если обьявим в этом случае класс таким образом, то получим снова ошибку
	//	 NyClass<Numbers, Numbers> obj = new MyClass<Numbers, Numbers>();
	/*
	void set(T o) {
		obj1 = o;
	}
	
	void set(V o) {
		obj2 = o;
	}
	*/
}

//Получить экзмепляр по параметру типа нельзя

class Gen<T> {
	T obj;
	
	/* Ошибка компиляции
	Gen() {
		obj = new T();
	}
	*/
}

//Ограничения на статические члены
class Wrong<T> {
	//нельзя создать статические переменные типа Т
	//static T obj; 
	
	//нельзя исопльзовать пармаетр типа Т в статическом методе
	/*
	static T getob() {
		return obj;
	}
	*/
	
	//но можно обьявить статический метод со своими параметрами типов
	static <K, V> 
	void mymethod(K obj1, V obj2) {
		K ob1;
		V ob2;
		
		ob1 = obj1;
		ob2 = obj2;
	}
}

//Ограничения на обобщенные массивы

class Temp<T extends Number> {
	T obj;
	T obj_array[]; //Ссылка на массив типа Т
	
	Temp(T o, T[] mas) {
		obj = o;
		
		//obj_array = new T[10]; //Нельзя создать массив типа T
		obj_array = mas; //можно присвить ссылку, существующему массиву		
	}
	
}


public class AmbiguityRestrictionsGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer n[] = {1, 2, 3, 4, 5};
		
		Temp<Integer> myobj = new Temp<Integer>(12, n);
		
		//Нельзя создать массив специфических для типа обобщенных ссылок
		
		//Temp<Integer> myarray1[] = new Temp<Integer>[10];
		
		//Но можно создать массив ссылок на обобщенный тип, используя метасимвол
		Temp<?> myarray2[] = new Temp<?>[10];

	}

}
