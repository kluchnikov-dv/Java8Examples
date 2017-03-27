//Глава 11
//Расширение класса Thread
//стр. 294-295

class ChildThread extends Thread {
	
	ChildThread() {
		super("Дочерний поток");
		System.out.println("Дочерний поток создан: " + this);
		start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток: " + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Выполнение дочернего потока прервано.");			
		}
		System.out.println("Выполнение дочернего потока завершено.");
	}
}


public class ThreadDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildThread();
		Thread t = Thread.currentThread();
		System.out.println("Главный поток создан: " + t.getName());
		try{
			for(int i = 5; i > 0; i--) {
				System.out.println("Главный поток: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println("Выполнение главного потока было прервано.");			
		}
		System.out.println("Выполнение главного потока завершено.");		
	}

}
