//Глава 8
//Наследование
//стр. 209-210

class A {
	int i;
	int j;
	
	void showij() {
		System.out.println("Значение элементов i и j: " + i + " " + j);
	}
}

class B extends A {
	int k;
	void showk() {
		System.out.println("Значение элемента k: " + k);
	}
	
	void sumijk() {
		System.out.println("Сумма элементов i, j, k: " + (i + j + k));
	}
}

public class Inheritance {
	public static void main(String[] args){
		A tempA = new A();
		B tempB = new B();
		
		tempA.i = 10;
		tempA.j = 20;
		System.out.println("Значение параметров обьекат супер класса A: ");
		tempA.showij();
		
		tempB.i = 7;
		tempB.j = 8;
		tempB.k = 9;
		System.out.println("Значение параметров обьекат подкласса B: ");
		tempB.showij();
		tempB.showk();		
		tempB.sumijk();
	}
}
