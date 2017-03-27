//8 глава
//Переопределение методов
//стр. 223

class A {
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("Значение переменных i и j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	void show(String msg) {
		System.out.println(msg + k);
	}
}

public class OverridingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(1, 2, 3);		
		//демонстрация перегрузки методов суперкласса и подкласса
		b.show("Значение переменной k: "); //подкласс с сигнатурой вывода строки
		b.show();//суперкласс
	}
}
