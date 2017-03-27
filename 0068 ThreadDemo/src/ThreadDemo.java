//Глава 11
//Реализация интерфейса Runnable
//стр. 292-293

class ChildThread implements Runnable {
	Thread t;
	
	ChildThread() {
		//создаем новый поток
		t = new Thread(this, "Дочерний поток.");
		System.out.println("-------------------->Дочерний обьект создан: " + t);
		//запускаем новый поток
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--){
				System.out.println("-------------------->Дочерний поток: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e){
			System.out.println("-------------------->Выполнение дочернего потока прервано. " + e);
		}
		System.out.println("-------------------->Выполнение дочернего потока завершено.");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildThread();
		
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Главный поток: " + i);
				Thread.sleep(1000);
			}
			
		} catch(InterruptedException e) {
			System.out.println("Выполнение главного потока прервано. " + e);
		}		
		System.out.println("Выполнение главного потока завершено.");

	}

}
