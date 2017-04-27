//Глава 14
//Переопределение методов в обобщенных классах
//стр. 428-429

class Generalization<T> {
	T obj;
	
	Generalization(T o) {
		obj = o;
	}
	
	T getobj() {
		System.out.print("Вызов getobj() из класса Generalization: ");
		return obj;
	}	
}

class SubGeneralization<T> extends Generalization<T> {
	
	SubGeneralization(T o) {
		super(o);
	}
	
	T getobj() {
		System.out.print("Вызов метода getobj() из SubGeneralization: ");
		return obj;
	}
}



public class RedefinitionMethodsGeneralization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generalization<Integer> iobg = new Generalization<Integer>(777);
		SubGeneralization<Integer> iobsg = new SubGeneralization<Integer>(888);
		SubGeneralization<String> sobsg = new SubGeneralization<String>("Строка обобщенного подкласса.");
		
		System.out.println(iobg.getobj());
		System.out.println(iobsg.getobj());
		System.out.println(sobsg.getobj());

	}

}
