//Глава 10
//Оператор Throws
//стр. 274 

public class ThrowsDemo {
	
	static void ThrowOne() {
		System.out.println("В теле метода ThrowOne.");
		throw new IllegalAccessException("Демонстрация."); 
		//компилятор вызвал ошибку т.к. нет обработчика для исключения, либо не указаны
		//типы исключений которые может генерировать метод
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowOne();
	}

}
