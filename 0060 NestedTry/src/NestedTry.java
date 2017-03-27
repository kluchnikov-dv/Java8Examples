//Глава 10
//Вложенные операторы try
//стр. 270 - 271

public class NestedTry {

	private static int a, b; //модификатор static нужен потому, что переменные используются в статической функции,
							 //которая доступна до создания экземпляра класса
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			//Если не указаны аргументы, то сгенерируется исключение деление на ноль и его обработает внешний catch 
			a = args.length;
			b = 45 / a;			
			try {
				//Если указан один аргумент, то сгенерируется исключение деление на ноль и его обработает внешний catch, т.к. внутренний не соответствует типу исключения 
				if (a == 1) b = a / (a - a);
				//Если указано от 3-х и болле аргументов, то сгенерируется исключение выхода за пределы массива
				int c[] = {1};
				c[a] = 2;				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Индекс за пределами массива." + e + "\na = " + a);
			}
		} catch(ArithmeticException e) {
			System.out.println("Деление на ноль: " + e  + "\na = " + a);			
		}
	}
}