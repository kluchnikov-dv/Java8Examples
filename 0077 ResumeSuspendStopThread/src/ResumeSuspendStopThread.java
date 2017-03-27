//Глава 11
//Возобновление, приостановкаи остановка потоков исполнения
//стр. 312-313

class NewThread implements Runnable{
	String name;
	Thread t;
	boolean isStop; //Переменная отвечающая за приостановление
	
	//инициализируем поток в конструкторе класса и запускаем
	NewThread(String nameThread) {
		name = nameThread;
		t = new Thread(this, name);
		System.out.println("Создан поток: " + name);
		isStop = false;
		t.start();
	}
	
	//эту часть кода поток постоянно выполняет
	public void run() {
		try {
			for( int i = 15; i > 0; i--){
				System.out.println(name + " : " + i);
				Thread.sleep(100);
				//доступ к этой части когда по очереди
				synchronized(this){					
					while(isStop) {
						wait();
					}
				}
			}
		} catch(InterruptedException e) {
			System.out.println("Прерываение потока: " + name);
		}
		System.out.println(name + " завершен.");
	}
	
	//доступ к этой части когда по очереди	
	synchronized void mysuspend() {
		isStop = true;
	}

	//доступ к этой части когда по очереди
	synchronized void myresume() {
		isStop = false;
		notify();
	}
	
}


/* опрос состояния потоков исполнения
 * 
class GetStateThread implements Runnable {
	Thread t;
	Thread testThread;
	
	GetStateThread(Thread t) {

		this.t = t;
		testThread = new Thread(this);
		testThread.start();
	}
	
	public void run() {
		while(true) {
			System.out.println("Состояние потока : " + t.getName() +  " = " + t.getState());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Опрос потока: " + t.getName() + " прерван.");
			}
		}
	}
}
*/

public class ResumeSuspendStopThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewThread ob1 = new NewThread("Один");
		NewThread ob2 = new NewThread("Два");
		
		//GetStateThread ob1State = new GetStateThread(ob1.t);
		//GetStateThread ob2State = new GetStateThread(ob2.t);
		
		try {
			Thread.sleep(1000);
	
			ob1.mysuspend();
			System.out.println(ob1.name + " приостановлен.");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println(ob1.name + " возабновлен.");
			
			ob2.mysuspend();
			System.out.println(ob2.name + " приостановлен.");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println(ob2.name + " возабновлен.");
			
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван.");
		}
				
		
		
		try{
			ob1.t.join();
			ob2.t.join();
		} catch(InterruptedException e) {
			System.out.println("Главный поток прерван.");			
		}
		System.out.println("Главный поток завершен.");
		
		//ob1State.testThread.stop();
		//ob2State.testThread.stop();
		
	}

}
