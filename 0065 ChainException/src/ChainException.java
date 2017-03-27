//Глава 10
//Цепочки исключений
//стр. 281


public class ChainException {

	static void funcdemo() {
		//Создать исключение
		NullPointerException e = new NullPointerException("Верхний уровень исключения.");
		//Связываем причину исключения
		e.initCause(new ArithmeticException("Настоящая причина исключения арифметическая."));
		throw e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			funcdemo();
		} catch (NullPointerException e) {
			System.out.println("Перехвачено исключение: " + e);
			System.out.println("Причина исключения: " + e.getCause());
		}
	}

}
