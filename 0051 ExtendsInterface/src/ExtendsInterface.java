//Глава 9
//Расширение интерфейсов
//стр. 255

interface A {
	void method1();
	void method2();
}

interface B extends A {	
	void method3();
}

class MyClass implements B {
	public void method1() {
		System.out.println("Реализация method1()");
	}
	public void method2() {
		System.out.println("Реализация method2()");
	}
	public void method3() {
		System.out.println("Реализация method3()");
	}
	
}

public class ExtendsInterface {
	public static void main(String arg[]){
		MyClass mc = new MyClass();		
		mc.method1();
		mc.method2();
		mc.method3();
	}

}
