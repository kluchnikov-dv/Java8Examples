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
	
	void show() {
		super.show();//если хотим достучаться до переопределенного метода
		System.out.println("Значение переменной k: " + k);
	}
}

public class OverridingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(1, 2, 3);
		b.show(); //произойдет вызов метода подкласса, т.к. метод show() пепреопределяет метод суперкласса
	}
}
