//Глава 14
//Применение обобщенного суперкласса
//стр.423-424


//Простой обобщенный суперкласс
class Generalization<T> {
	T obj;
	
	Generalization(T o) {
		obj = o;
	}
	
	public T getobj() {
		return obj;
	}
}

//Подкласс обобщенного суперкласса
class SubGeneralization<T, V> extends Generalization<T> {
	V obj2;
	
	SubGeneralization(T t, V v) {
		super(t);
		obj2 = v;
	}
	
	V getobj2() {
		return obj2;
	}
}

public class GeneralizationSuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubGeneralization<String, Integer> ob = new SubGeneralization("Строка суперкласса.", 100);
		//Полная запись 
		SubGeneralization<String, Integer> ob2 = new SubGeneralization<String, Integer>("Строка суперкласса 2.", 777); 
		System.out.println("ob.obj = " + ob.getobj() + "\nob.obj2 =" + ob.getobj2());
		System.out.println("\nob2.obj = " + ob2.getobj() + "\nob2.obj2 =" + ob2.getobj2());
		
	}

}
