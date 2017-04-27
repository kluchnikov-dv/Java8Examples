//Глава 14
//Выведение типов и обобщения
//стр. 429 - 430

class MyClass<T, V> {
	T obj1;
	V obj2;
	
	MyClass(T t, V v) {
		obj1 = t;
		obj2 = v;
	}
	
	boolean isSame(MyClass<T, V> o) {		
		//Вот тут как то неправильно сравниваются параметры, или правильно но я не догоняю
		if(obj1 == o.obj1 && obj2 == o.obj2) return true;
		else return false;		
	}
		
}

public class ExcretionTypesGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Старый вид
		MyClass<Integer, String> myobj1 = new MyClass<Integer, String>(777, "Строка.");
		//Новый вид
		MyClass<Integer, String> myobj2 = new MyClass<>(777, "Строка.");
		
		
		//Сравнение двух обьектов с одинаковыми параметрами 
		if(myobj1.isSame(myobj2)) System.out.println("Одинаковые.");
		else System.out.println("Разные.");
		
		//Сравнение с самим собой
		if(myobj1.isSame(myobj1)) System.out.println("Одинаковые.");
		else System.out.println("Разные.");
		
		//сравнение с вновь создаваемым
		//такая запись тоже допустима		
		if(myobj2.isSame(new MyClass<>(777, "Строка."))) System.out.println("Одинаковые обьекты.");
		else System.out.println("Разные.");
		
	}

}
