//Глава 8
//Другое применение ключевого слова super
//стр. 218

class A {
	int i;
}

class B extends A {
	int i;
	
	B(int a, int b) {
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("Значение переменной i суперкласса A = " + super.i);
		System.out.println("Значение переменной i подкласса В = " + i);
	}
}

public class UseSuperclassElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B tempB = new B(1, 4);
		tempB.show();
	}

}
