//Глава 13
//Вызов перегружаемых конструкторов по ссылке this()
//стр. 391

class MyClass {
	int a, b;
	
	MyClass(int i, int j) {
		a = i;
		b = j; 
	}
	
	//присваиваем одинаковое значение 
	MyClass(int i) {
		this(i, i);
	}

	//присваиваем нулевое значение
	MyClass() {
		this(0, 0);
	}
	
	void printab() {		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}
}

public class CallConstructorByThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass(5);
		MyClass obj3 = new MyClass(3, 2);
		System.out.println("obj1");
		obj1.printab();
		System.out.println("obj2");
		obj2.printab();
		System.out.println("obj3");
		obj3.printab();
	}

}
