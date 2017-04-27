//Глава 14
//Обобщенный подкласс
//стр. 424-425

class NonGeneralization {
	int num;
	
	NonGeneralization(int value) {
		num = value;
	}
	
	int getnum() {
		return num;
	}
}

class Generalization<T> extends NonGeneralization {
	T obj;
	
	Generalization(T o, int n) {
		super(n);
		obj = o;
	}
	
	T getobj() {
		return obj;
	}
}


public class GeneralizationSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generalization<String> ob = new Generalization<String>("Строка обобщенного подкласса.", 777);
		System.out.println("Число простого класса num = " + ob.getnum() + "\nobj = " + ob.getobj());
	}

}
