//Глава 10
//Оператор finally
//стр. 275 - 276

public class FinallyDemo {

	static void procA() {
		try {
			System.out.println("Внутри метода procA().");
			throw new RuntimeException("Демонстрация.");
		} finally {
			System.out.println("Блок finally внутри метода procA()");
		}
	}
	
	static void procB() {
		try {
			System.out.println("Внутри метода procB().");
			return;
		} finally {
			System.out.println("Блок finally внутри метода procB().");
		}
	}
	
	static void procC() {
		try {
			System.out.println("Внутри метода procC().");
		} finally {
			System.out.println("Блок finally внутри метода procC().");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			procA();
		} catch (RuntimeException e) {
			System.out.println("Исключение перехвачено.\n" + e);
		}
		System.out.println("");
		procB();
		System.out.println("");
		procC();
	}

}
