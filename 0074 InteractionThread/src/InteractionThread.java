//Глава 11
//Взаимодействие потоков исполнения
//стр. 306

class Q {
	int n; //элемент очереди
	
	//Получить элемент очереди
	synchronized int get() {		
		System.out.println("Получено: " + n);
		return n;
	}
	
	//отправить элеемнт очереди
	synchronized void put(int n) {
		this.n = n;
		System.out.println("Отправлено: " + n);
	}
}

class Producer implements Runnable {
	Q q;
	
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Поставщик.").start();
	}
	
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		}
	}	
}

class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q) {
		this.q = q;
		new Thread(this, "Получатель.").start();
	}
	
	public void run() {
		while(true){
			q.get();
		}
	}
}


public class InteractionThread {
	
	public static void main(String[] args) {
	
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Для завершения программы нажмите Ctrl+C.");
	}
}
