//Глава 10
//Оператор throws
//стр. 274

public class ThrowsDemo2 {

	static void throwOne() throws IllegalAccessException {
		System.out.println("В теле метода throwOne");
		throw new IllegalAccessException("Демонстрация.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Перехвачено исключение: " + e);
		}
	}

}
