//Глава 8
//Динамическая диспетчерезация методов - муть, но понять можно
//стр.  226


class A {
	void callme() {
		System.out.println("Вызов callme() из класса A");
	}
}

class B extends A {
	void callme() {
		System.out.println("Вызов callme() из класса B");
	}
}

class C extends A {
	void callme() {
		System.out.println("Вызов callme() из класса C");
	}
}

public class DynamicSchedulingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		B b = new B();
		C c = new C();
		
		A r;
		r = a;
		r.callme(); //вызов метода callme() происходит не по типу ссылочной переменной, а по типу обьекта на которы ссылается ссылка
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();
	}

}
