//Глава 10
//Создание собственных подклассов исключений
//стр. 280

class MyException extends Exception {
	private int detail;
	
	MyException(int a) {
		detail = a;
	}
	
	public String toString() {
		return "MyException [" + detail + "]";
	}
}

public class MyExceptionDemo {

	static void compute(int a) throws MyException {
		System.out.println("Вызван метод compute() a = " + a);
		if (a > 10) throw new MyException(a);
		System.out.println("Нормальное завершение метода compute().");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			compute(1);
			compute(12);
			
		} catch(MyException e) {
			System.out.println("Перехвачено исключение: " + e);
		}

	}

}
