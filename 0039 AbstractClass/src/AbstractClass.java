//Глава 8
//Абстрактные классы
//стр. 229-230

abstract class A {
	abstract void callme();
	
	//абстрактные классы все же могу содержать конкретные методы
	void printmethod() {
		System.out.println("Конкретный метод в абстрактном классе.");
	}
}
class B extends A {
	void callme() {
		System.out.println("Абстрактный метод реализованный в подклассе.");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();		
		b.callme();
		b.printmethod();
	}

}

