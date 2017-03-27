//Глава 8
//Ключевое слово final в сочетании с наследованием. Предотвращение переопределения с помощью ключевого слова final.
//стр. 232

class A {
	final void meth() {
		System.out.println("Это завершенный метод который нельзя переопределять.");
	}
}

class B extends A {
	/*
	void meth() {
		System.out.println("Недопустимо переопределение метода.");
	}
	*/
}

public class MethodFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		B b = new B();
		b.meth();
	}

}
