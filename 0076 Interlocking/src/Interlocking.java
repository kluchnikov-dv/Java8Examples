//Глава 11
//Взаимная блокировка
//стр. 309-310

class A {
			
	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();	
		System.out.println(name + " вошел в метод foo() класса A ");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Прерывание.");
		}
		System.out.println(name + " пытается вызвать метод last() класса B");
		b.last();
	}
	
	synchronized void last()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + " в методе last() класса A.");
	}
}

class B {
	
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " вошел в метод bar() класса B ");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Прерывание.");
		}
		System.out.println(name + " пытается вызвать метод last() класса A");
		a.last();
	}
	
	synchronized void last()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + " в методе last() обьекта B.");
	}
}

public class Interlocking implements  Runnable{
	A a = new A();
	B b = new B();
	
	Interlocking() {
		Thread.currentThread().setName("Главный поток");
		Thread t = new Thread(this, "Соперничающий поток");
		t.start();
		
		a.foo(b);
	}
	
	public void run() {
		b.bar(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Interlocking();
	}

}
