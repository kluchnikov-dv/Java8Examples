//Глава 11
//Взаимодействие потоков исполнения
//стр. 307 - 308

//реализуем постановку и извлечение из очереди
class Q {
	int n;
	boolean CanToTake = false;
	
	//получить сообщение
	synchronized int get() {
		
		try {
			while(!CanToTake) wait(); //приостановить поток пока не отправлено сообщение
		} catch (InterruptedException e) {
			System.out.println("Прерывание ожидания получения сообщения.");
		}		
		
		System.out.println("Получено: " + n);
		CanToTake = false;
		notify(); //возобновить поток
		return n;
	}
	
	//отправить сообщение
	synchronized void send(int n) {
		try {
			while(CanToTake) wait(); //приостановить поток пока не забрали сообщение
		} catch(InterruptedException e) {
			System.out.println("Прерывание ожидания отправки сообщения.");
		}
		
		this.n = n;
		System.out.println("Отправлено: " + n);
		CanToTake = true;
		notify(); //возобновить поток		
	}
}

//Получатель
class Destination implements Runnable{
	Q q;
	
	Destination(Q q) {
		this.q = q;
		new Thread(this, "Получатель").start();
	}
	
	public void run() {
		while(true) {
			q.get();
		}
	}
	
}

//Отправитель
class Sender implements Runnable{
	Q q;	
	
	Sender(Q q) {
		this.q = q;
		new Thread(this, "Отправитель").start();		
	}
	
	public void run() {
		int i = 0;
		while(true) {
			q.send(i++);	
		}		
	}
}

public class InteractionThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new Sender(q);
		new Destination(q);
		System.out.println("Для приостановки выполнения программы нажмите Ctrl+C");
	}

}
