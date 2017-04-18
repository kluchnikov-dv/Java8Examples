//Глава 13
//Оператор instanceof
//стр. 379 - 380 

class A {
	int i;
	int j;
}

class B {
	int i;
	int j;
}

class C extends A {
	int k;
}

class D extends A {
	int k;
}

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		if (a instanceof A) System.out.println("a принадлежит типу A");
		if (b instanceof B) System.out.println("b принадлежит типу B");
		if (c instanceof C) System.out.println("c принадлежит типу C");		
		if (c instanceof A) System.out.println("c может быть приведен к типу A");
		if (a instanceof C) System.out.println("a может быть приведен к типу С"); //эта строка не будет выведена
		System.out.println("\n");
		//работа с сылками
		A ob;
		ob = d;
		System.out.println("ob ссылается на d");
		if (ob instanceof D) System.out.println("ob является экземпляром D");
		System.out.println("\n");
		
		ob = c;
		System.out.println("ob ссылается на c");
		if (ob instanceof D) System.out.println("ob можно привести к типу D");
		else System.out.println("ob нельзя привести к D");
		
		if (ob instanceof A) System.out.println("ob можно привести к типу A");
		System.out.println("\n");
		
		//Все обьекты могут быть приведены к типу Object
		if (a instanceof Object) System.out.println("a может быть приведен к типу Object");
		if (b instanceof Object) System.out.println("b может быть приведен к типу Object");
		if (c instanceof Object) System.out.println("c может быть приведен к типу Object");
		if (d instanceof Object) System.out.println("d может быть приведен к типу Object");
	}

}
