//Глава 11
//Применение методов isAlive() join()
//стр. 297-298

class ChildThread implements Runnable {
	String nameThread;
	Thread t;
	
	ChildThread(String name) {
		nameThread = name;
		t = new Thread(this, nameThread);
		System.out.println("Создан поток: " + nameThread);
		t.start();		
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(nameThread + ": " + i);
				Thread.sleep(1000);				
			}
		} catch (InterruptedException e) {
			System.out.println("Поток " + nameThread + "прерван.");
		}
	}
}


public class ThreadisAliveJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread obj1 = new ChildThread("Один");		
		ChildThread obj2 = new ChildThread("Два");
		ChildThread obj3 = new ChildThread("Три");
		
		System.out.println("Поток Один был запущен: " + obj1.t.isAlive());
		System.out.println("Поток Два был запущен: " + obj2.t.isAlive());
		System.out.println("Поток Три был запущен: " + obj3.t.isAlive());
		
		try {
			System.out.println("Ожидание завершение потоков.");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван.");
		}
		System.out.println("Поток Один был запущен: " + obj1.t.isAlive());
		System.out.println("Поток Два был запущен: " + obj2.t.isAlive());
		System.out.println("Поток Три был запущен: " + obj3.t.isAlive());
		System.out.println("Главный поток завершен. ");
	}

}