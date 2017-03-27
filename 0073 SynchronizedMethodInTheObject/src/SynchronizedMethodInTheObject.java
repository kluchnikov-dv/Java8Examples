//Глава 11
//Оператор Synchronized
//стр. 303-304

class Callme {	
	void call(String msg) {
		try {
			System.out.print("[" + msg);
			Thread.sleep(1000);;
		} catch(InterruptedException e) {
			System.out.println("Прервано.");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String message;
	Callme target;
	Thread potok;	
	
	Caller(Callme t, String msg) {
		message = msg;
		target = t;
		potok = new Thread(this);
		potok.start();
	}
	
	public void run() {
		synchronized(target) {
			target.call(message);
		}
	}
	
}

public class SynchronizedMethodInTheObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callme c = new Callme();		
		Caller obj1 = new Caller(c, "Добро пожаловать");
		Caller obj2 = new Caller(c, "в синхронизированный");
		Caller obj3 = new Caller(c, "мир!");
		
		try {			
			obj1.potok.join();
			obj2.potok.join();
			obj3.potok.join();
		} catch (InterruptedException e) {
			System.out.println("Прервано.");
		}		
	}

}
