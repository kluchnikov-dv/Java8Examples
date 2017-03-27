//Глава 11
//Создание многоих потоков исполнения
//стр. 295 - 296

class ChildThread implements Runnable {
	String nameThread;
	Thread t;
	
	ChildThread(String name) {
		nameThread = name;
		t = new Thread(this, name);
		System.out.println("Создан поток: " + name);
		t.start();
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(nameThread + ": " + i);
				Thread.sleep(1000);
			}			
		} catch (InterruptedException e) {
			System.out.println(nameThread + " прерван.");
		}
		System.out.println(nameThread + " завершен.");
	}
	
}

public class CreatingManyThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildThread("1 ПОТОК");
		new ChildThread("2 ПОТОК");
		new ChildThread("3 ПОТОК");
		try {
			Thread.sleep(10000);
		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван.");
		}
		System.out.println("Главный поток завершен.");
	}

}
