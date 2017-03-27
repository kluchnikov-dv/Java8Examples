//Глава 8
//Порядок вызова констуркторов
//стр. 222

class A {
	A() {
		System.out.println("конструктор класса А");
	}
}

class B extends A {
	B() {
		System.out.println("конструктор класса В");
	}
}

class C extends B {
	C() {
		System.out.println("конструктор класса С");
	}
}

public class OrderCallConstructers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
