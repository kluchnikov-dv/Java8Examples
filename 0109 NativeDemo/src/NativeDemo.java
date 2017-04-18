//Глава 13
//Платформенно-ориентированные методы
//стр.381-383

//Получаем библиотеку NativeDemo.h
//javah -jni NativeDemo 

//Компиляция исходников Cи
// gcc -Wall -Wextra -O -ansi -pedantic -shared NativeDemo.c -o NativeDemo.so


//Пример применения платформенно ориентированного метода
public class NativeDemo {
	int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NativeDemo obj = new NativeDemo();
		obj.i = 10;
		System.out.println("Значение переменной obj.i перед вызовом платформенно-ориенитированного метода: " + obj.i);
		obj.test();
		System.out.println("Значение переменной obj.i после вызова платформенно-ориентированного метода: " + obj.i);
	}
	
	public native void test();
	
	static {
		System.loadLibrary("/home/mendeleev/workspace/\"0109 NativeDemo\"/bin/NativeDemo");
	}
}