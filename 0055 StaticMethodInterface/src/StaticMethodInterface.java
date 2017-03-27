//Глава 9
//Применение статических методов в интерфейсе
//стр. 260 - 261

interface MyInterface {
	int getNumber();
	
	default String getString() {
		return "Обьект типа String по умолчанию";
	}
	
	static int getDefaultNumber() {
		return 0;
	}
}

public class StaticMethodInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Значение возвращаемое статическим методом в интерфейсе MyInterface: " + MyInterface.getDefaultNumber());
	}

}
