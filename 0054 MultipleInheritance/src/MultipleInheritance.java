//Глава 9
//Вопросы множественного наследования
//стр. 259-260


interface Alpha {
	default void reset() {
		System.out.println("Фугкция reset() в интерфесе Alpha.");
	}
}

interface Beta {
	default void reset() {
		System.out.println("Функция reset() в интерфейсе Beta.");
	}
}

interface Sigma extends Alpha {
	default void reset() {
		System.out.println("Функция reset() в интерфейсе Sigma,\nрасширяющий интерфейс Alpha.");
		//Alpha.super.reset();
	}
}

class A implements Alpha, Beta {
	public void reset() {
		System.out.println("Переопределение функции reset() в классе A,\nкоторый реализует 2 интерфейса Alpha и Beta,\nиначе ошибка.\n");
	}
}

class B implements Sigma {
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj1 = new A();
		obj1.reset();
		
		B obj2 = new B();
		obj2.reset();		
	}

}
