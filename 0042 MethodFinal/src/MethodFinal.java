//Глава 8
//Ключевое слово final в сочетании с наследованием. Предотвращение наследования с помощью ключевого слова final.
//стр. 232

final class A {
	void meth() {
		System.out.println("финальный класс, наследование запрещено!");
	}
}

/*
Это расширение класса не возможно, т.к. класс A завершённый
class B extends A {
	
}
*/

public class MethodFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.meth();
	}
}
