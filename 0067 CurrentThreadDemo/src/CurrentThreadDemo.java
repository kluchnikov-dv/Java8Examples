//Глава 11
//Главный поток исполнения
//стр. 290

public class CurrentThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Текущий поток исполнения: " + t);
		
		t.setName("My Thread");
		System.out.println("Текущий поток исполнения после переименования: " + t);
		
		try {
			for(int i = 5; i >= 0; i--) {
				System.out.println(i);
				t.sleep(1000);
			} 
		}catch (InterruptedException e) {
			System.out.println("Главный поток исполнения прерван." + e);
		}
	}
}
