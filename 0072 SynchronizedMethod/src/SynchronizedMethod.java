//Глава 11
//Применение синхронизированных методов
//стр. 301-302

class Callme {
	//добавляем методу ключевое слово synchronized, в этом случае доступ к методу будет осуществляться по очереди
	synchronized void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);			
		} catch(InterruptedException e) {
			System.out.println("Прервано исполнение метода Call.");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;
	
	Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {		
		target.call(msg);		
	}
	
}


public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callme c = new Callme();
		//то что синхронизируется видно
		Caller obj1 = new Caller(c, "Добро пожаловать");		
		Caller obj2 = new Caller(c, "в синхронизированный");		
		Caller obj3 = new Caller(c, "мир!");
		
		
		//ожидать завершения программы
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Работа какого-то из 3-х потоков исполнения прервана.");
		}
	}

}
